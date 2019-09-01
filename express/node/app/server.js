const express = require('express');
const bodyParser = require('body-parser');

const app = express();

// app.use(bodyParser());
app.use(bodyParser.urlencoded({ extended: true }));

app.get('/echo', (req, res) => {
  res.send(`★${req.query.message}★ from Express`);
});

app.post('/echo', (req, res) => {
  res.send(`★${req.body.message}★ from Express`);
});

app.listen(3000);