const express = require('express');
const bodyParser = require('body-parser');
const mongoose = require('mongoose');
const app = express();
const Garantie = require('./model/GarantieModel'); 
const Sequence = require('./model/sequenceModel');

mongoose.connect('mongodb://localhost:27017/test', {
    useNewUrlParser: true,
    useUnifiedTopology: true
}).then(() => {
    console.log('Connected to the database');
}).catch(err => {
    console.error(err);
});

async function getNextSequenceValue(sequenceName) {
    const sequenceDoc = await Sequence.findByIdAndUpdate(
        sequenceName,
        { $inc: { sequenceValue: 1 } },
        { new: true, upsert: true }
    );
    return sequenceDoc.sequenceValue;
}


app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/getGaranties', async (req, res) => {
    try {
        const quotes = await Garantie.find();
        res.json(quotes);
    } catch (error) {
        console.error(error);
        res.status(500).json({ error: 'Internal server error' });
    }
});

app.post('/addGarantie', async (req, res) => {
    try {
        const { name, quote, amount, startDate, idClient } = req.body;
        const newIdGarantie = await getNextSequenceValue('garantieSeq');
        const newQuote = new Garantie({ name, quote, idGarantie: newIdGarantie, amount, startDate, idClient });
        const savedQuote = await newQuote.save();
        res.json(savedQuote);
    } catch (error) {
        console.error(error);
        res.status(500).json({ error: 'Internal server error' });
    }
});

app.put('/updateGarantie/:idGarantie', async (req, res) => {
    const idGarantie = req.params.idGarantie;
    try {
        const updatedQuote = await Garantie.findOneAndUpdate(
            { idGarantie: idGarantie },
            { $set: req.body },
            { new: true }
        );
        if (!updatedQuote) {
            res.status(404).json({ error: 'Quote not found' });
        } else {
            res.json({ message: 'Quote updated successfully' });
        }
    } catch (error) {
        console.error(error);
        res.status(500).json({ error: 'Internal server error' });
    }
});


app.delete('/deleteGarantie/:idGarantie', async (req, res) => {
    const idGarantie = req.params.idGarantie;
    try {
        const result = await Garantie.deleteOne({ idGarantie: idGarantie });
        if (result.deletedCount === 0) {
            res.status(404).json({ error: 'Quote not found' });
        } else {
            res.json({ message: 'Quote deleted successfully' });
        }
    } catch (error) {
        console.error(error);
        res.status(500).json({ error: 'Internal server error' });
    }
});

app.listen(3000, () => {
    console.log('Server is running on port 3000');
});
