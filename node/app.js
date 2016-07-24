'use strict';

const express = require('express');
const app = express();

let correctVersion = false;

try {
  console.timeEnd("foo");
} catch (e) {
  correctVersion = true;
}

if (!correctVersion) {
  throw new Error("Application failed to start");
}

app.get('/status', (req, res) => {
  res.json({
    status: "working"
  });
});

app.listen(3000, () => {
  console.log('App listening on port 3000');
});
