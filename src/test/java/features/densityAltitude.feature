Feature: Density Altitude

  On June 19 and 20, 2017, many flights were cancelled at Arizona's Phoenix Sky Harbor airport
  because it was "too hot."  Really?  The engineering reason has to do with the fact that the amount
  of lift generated by a wing is related to the air that it flies in.  When the air becomes "thin"
  because of heat and humidity (water vapor is less dense than air: that's why clouds tend to float
  above us), they produce less lift, and require higher speeds through the air to produce the lift
  needed to allow the airplanes to take off.  Higher speeds require longer runways, and at a certain
  point, the heat is just too high to have enough safety on any particular runway to allow a safe depature.

  With Global Warming becoming all too real, pliots need to keep their eye on the density altitude (a measure
  of what the heat and humidity would translate into for "standard" atmospheric conditions) as they evaluate
  how much runway is needed for a safe takeoff and landing.  If you're interested in the details of how
  density altitude is calculated, take a look at https://en.wikipedia.org/wiki/Density_altitude.

  There are many online resources that pilots can use to calculate density altitude.  We'd like to test them!


  Scenario Outline: Density altitude checking
    Given I'm using the following browsers
      | firefox        |
      | chrome         |
      | chromeHeadless |
    And I'm using the following appplications
      | Pilot Friend          |
      | Shelquist Engineering |
    When the elevation is "<elevation>" "<elevationUnits>"
    And the temperature is "<temperature>" "<temperatureUnits>"
    And the altimeter is "<altimeter>" "<altimeterUnits>"
    And the dew point is "<dewPoint>" "<dewPointUnits>"
    Then the density altitude should be "<densityAltitude>" "<densityAltitudeUnits>"

    Examples:
      | elevation | elevationUnits | temperature | temperatureUnits | altimeter | altimeterUnits | dewPoint | dewPointUnits | densityAltitude | densityAltitudeUnits |
      | 182       | feet           | 80          | F                | 30.02     | in Hg          | 70       | F             | 1779            | feet                 |
      | 182       | feet           | 60          | F                | 29.95     | in Hg          | 40       | F             | 365             | feet                 |
      | 30        | meters         | 25          | C                | 1000      | hPa            | 20       | C             | 618             | meters               |