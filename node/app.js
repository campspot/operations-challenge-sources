var express = require('express');
var app = express();

app.get('/api/v1/status', function (req, res) {
  res.json({
    status: "working"
  });
});

app.listen(3000, function () {
  console.log('App listening on port 3000');
});
