'use strict';

application.controller('roomEditController', [
  '$scope',
  'roomService',
  function ($scope, roomService) {
    $scope.saveRoom = function () {
      roomService.saveRoom($scope.room)
        .then(function (response) {
          if (response.status === 204) {
            $scope.rooms.push($scope.room);
          }
        });
    }
  }
]);
