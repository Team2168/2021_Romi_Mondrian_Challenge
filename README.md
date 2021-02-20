# 2021_Romi_Mondrian_Challenge
repo to store our Mondrian Challenge code

# Documentation

  * [Mondrian MAdness Challenge Rules](https://wpilib.org/blog/mondrian-madness-mini-bot-challenge)
  * [Full romi hardware user manual](https://www.pololu.com/docs/0J69/all)
  * WPILib [getting started with Romi documumentation](https://docs.wpilib.org/en/latest/docs/romi-robot/index.html)

# Usage:

## Battery installation

> The correct orientation for the batteries is indicated by the battery-shaped holes in the Romi chassis as
> well as the + and - indicators in the chassis itself.

![romi batteries](https://docs.wpilib.org/en/latest/_images/assembly-batteries.png)

## Setup wifi on the romi:

https://docs.wpilib.org/en/latest/docs/romi-robot/imaging-romi.html

## Deploying code:

https://docs.wpilib.org/en/latest/docs/romi-robot/programming-romi.html#running-a-romi-program

> One aspect where a Romi project differs from a regular FRC robot project is that the code is not deployed
> directly to the Romi. Instead, a Romi project runs on your development computer, and leverages the WPILib
> simulation framework to communicate with the Romi robot.

To run a Romi program:
 * first, ensure that your Romi is powered on.
 * Connect to the WPILibPi-<number> wifi network broadcast by the Romi
 * running the code in simulation mode
 * Put the robot in `Teleoperated` or `Autonomous` modes will cause the code to execute on the romi.

## IMU calibration

The IMU is a sensor on the Romi that can tell us it's rotational position in three dimensions.
For auotonously driving the robot, We are primarily interested in using the IMUs Z axis heading data,
as this can tells us which wat the Romi is facing. For example, we can use it to drive in straight
lines, or turn to face a specific direction.

This sensor's accuracy appears to be fairly sensitive to temperature fluctuations. When it's working correctly, 
and the robot is sitting still, we should see that the robot's heading isn't changing. If the sensor calibration
is off, the sensor will report that the robot is turning, even though it's stationary. We call this error drift.
The drift can be measured and accounted for though by running a calibration routine on the Romi. 

Note that it doesn't appear this sensor can account for temperature fluctuations, so it might be best to have
the robot turned on for a few minutes so it can warm up beore running the calibration. When calibrated you
should observe ~0.01 deg/s drift. An incorrectly calibrated sensor will have ~1.0 deg/sec drift.

https://docs.wpilib.org/en/latest/docs/romi-robot/web-ui.html#imu-calibration

![imu calibration](https://docs.wpilib.org/en/latest/_images/romi-ui-imu-calibration.png)

