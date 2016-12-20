'use strict';

application.directive('roomList', function () {
  return {
    restrict: 'E',
    transclude: false,
    templateUrl: 'views/roomListView.html',
    controller: 'roomListController'
  };
});
