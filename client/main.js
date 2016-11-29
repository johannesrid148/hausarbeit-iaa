const url =
  'https://fintechtoolbox.com/bankcodes/50010517.json';

const request = new XMLHttpRequest();

request.onload = () => {
  if (request.status === 200) {
    alert(request.responseText);
  }
};

request.open("GET", url, true);
request.send(null);
