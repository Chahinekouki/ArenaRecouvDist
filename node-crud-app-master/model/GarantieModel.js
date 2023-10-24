const mongoose = require('mongoose');

// Define the schema for your quotes
const quoteSchema = new mongoose.Schema({
    name: String,
    quote: String,
    idGarantie: Number,
    amount: Number, // New attribute
    startDate: Date, // New attribute
    idClient: Number, // New attribute
});

// Create the Quote model
const Quote = mongoose.model('Quote', quoteSchema);

module.exports = Quote;
