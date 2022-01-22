<?xml version="1.0" encoding="UTF-8"?>
<dSL:App xmi:version="2.0" xmlns:xmi="http://www.omg.org/XMI" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:dSL="http://www.example.org/dSL">
  <bricks xsi:type="dSL:Sensor" name="button"/>
  <bricks xsi:type="dSL:Actuator" name="led" pin="1"/>
  <states name="activate">
    <transition sensor="//@bricks.0" next="//@states.0" value="HIGH"/>
  </states>
  <states name="disable">
    <transition sensor="//@bricks.0" next="//@states.1"/>
  </states>
</dSL:App>
