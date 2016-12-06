'use strict';

application.controller('roomListController', ['$scope', 'roomService', function ($scope, roomService) {
  roomService.findAll()
    .then(function (response) {
      $scope.rooms = response.data;
    })
}]);
