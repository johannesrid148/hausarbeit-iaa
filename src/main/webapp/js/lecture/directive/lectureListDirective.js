'use strict';

application.directive('lectureList', () => ({
  restrict: 'E',
  transclude: false,
  templateUrl: 'views/lecture/lectureListView.html',
  controller: 'lectureListController'
}));
