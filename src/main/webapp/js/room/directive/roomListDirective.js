'use strict';

application.directive('roomList', () => ({
  restrict: 'E',
  transclude: false,
  templateUrl: 'views/room/roomListView.html',
  controller: 'roomListController'
}));
