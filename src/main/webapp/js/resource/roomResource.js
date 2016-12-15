'use strict';

application.factory('Room', function () {
  return function (building, number) {
    this.building = building;
    this.number = number;
  }
});
