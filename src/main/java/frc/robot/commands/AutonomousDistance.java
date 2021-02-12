// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;

public class AutonomousDistance extends SequentialCommandGroup {
  /**
   * Creates a new Autonomous Drive based on distance. This will drive out for a specified distance,
   * turn around and drive back.
   */
  public AutonomousDistance() {
    addCommands(
        new DriveDistance(-0.5, 10),
        new TurnDegrees(-0.5, 180),
        new DriveDistance(-0.5, 10),
        new TurnDegrees(0.5, 180));
  }
}
