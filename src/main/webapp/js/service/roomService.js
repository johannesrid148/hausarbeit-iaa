'use strict';

application.service('roomService', ['$http', function ($http) {
  function findAll() {
    return $http.get('/iaa-lecture/api/rooms');
  }

  return {
    findAll: findAll
  }
}]);
