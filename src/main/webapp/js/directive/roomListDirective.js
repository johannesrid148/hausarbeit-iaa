'use strict';

application.directive('roomList', () => ({
  restrict: 'E',
  transclude: false,
  templateUrl: 'views/roomListView.html',
  controller: 'roomListController'
}));
