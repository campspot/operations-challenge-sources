'use strict';

const express = require('express');
const winston = require('winston');
const expressWinston = require('express-winston');

const app = express();

const logger = expressWinston.logger({
  transports: [
    new winston.transports.Console({
      colorize: true
    })
  ]
});

app.use(logger);

app.get('/status', (req, res) => {
  res.json({
    status: "working"
  });
});

app.listen(3000, () => {
  console.log('App listening on port 3000');
});
