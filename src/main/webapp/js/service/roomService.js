'use strict';

application.service('roomService', ['$http', function ($http) {
  this.findAll = function() {
    return $http.get('/iaa-lecture/api/rooms');
  }
}]);
