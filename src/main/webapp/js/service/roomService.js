'use strict';

application.service('roomService', [
  '$http',
  function ($http) {
    this.findAll = function () {
      return $http.get('/iaa-lecture/api/rooms');
    };

    this.saveRoom = function (room) {
      return $http.post('/iaa-lecture/api/rooms', room);
    };
  }
]);
