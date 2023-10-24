// sequenceModel.js
const mongoose = require('mongoose');

const sequenceSchema = new mongoose.Schema({
    _id: { type: String, required: true },
    sequenceValue: { type: Number, default: 1 },
});

const Sequence = mongoose.model('Sequence', sequenceSchema);

module.exports = Sequence;
