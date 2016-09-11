<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form>
  <div class="form-group">
    <label for="room.building">Building</label>
    <s:textfield name="room.building" id="room.building" requiredLabel="true" class="form-control" placeholder="A"/>
  </div>
  <div class="form-group">
    <label for="room.roomNumber">RoomNumber</label>
    <s:textfield name="room.roomNumber" id="room.roomNumber" requiredLabel="true" type="number" class="form-control"
                 placeholder="001"/>
  </div>
  <div class="form-group">
    <label for="room.seats">Seats</label>
    <s:textfield name="room.seats" id="room.seats" requiredLabel="true" type="number" class="form-control" placeholder="35"/>
  </div>
  <div class="checkbox">
    <label for="room.presenterAvailable">
      <s:checkbox name="room.presenterAvailable" id="room.presenterAvailable" requiredLabel="true" placeholder="Email"/>
      presenterAvailable
    </label>
  </div>
  <s:submit action="saveRoom" class="btn btn-primary"/>
</s:form>