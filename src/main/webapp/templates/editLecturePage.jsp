<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<h2><s:text name="header.editLecture"/></h2>
<s:form>
  <div class="form-group">
    <label for="lecture.beginDate"><s:text name="lecture.beginDate"/></label>
    <s:textfield name="lecture.beginDate" id="lecture.beginDate" requiredLabel="true" class="form-control" placeholder="A"/>
  </div>
  <div class="form-group">
    <label for="lecture.endDate"><s:text name="lecture.endDate"/></label>
    <s:textfield name="lecture.endDate" id="lecture.endDate" requiredLabel="true" type="endDate" class="form-control"
                 placeholder="001"/>
  </div>
  
  
  
  <div class="form-group">
    <label for="courseNaturalId"><s:text name="courseNaturalId"/></label>
    <s:textfield name="courseNaturalId" id="courseNaturalId" requiredLabel="true" class="form-control" placeholder="35"/>
  </div>

  <div class="checkbox">
    <label for="roomNaturalId"> <s:text name="roomNaturalId"/> </label>
    <s:textfield name="roomNaturalId" id="roomNaturalId" requiredLabel="true" placeholder="Email"/>
  </div>
  
  
  <s:submit action="saveLecture" key="button.addLecture" class="btn btn-primary"/>
</s:form>