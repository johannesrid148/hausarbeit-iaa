var url =
  'https://fintechtoolbox.com/bankcodes/50010517.json';

var request = new XMLHttpRequest();

request.onload = function() {
  if (request.status === 200) {
    alert(request.responseText);
  }
};

request.open("GET", url, true);
request.send();
