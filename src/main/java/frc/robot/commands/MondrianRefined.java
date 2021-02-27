// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class MondrianRefined extends SequentialCommandGroup {
  /** Creates a new MondrianRefined. */
  public MondrianRefined(Drivetrain simpleDrive) {
    final double SleepTime = 0.3;
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new DriveDistance(0.4, 17, simpleDrive),
    new Sleep().withTimeout(SleepTime),
    new TurnDegreesGyro(0.5, -90, simpleDrive).withTimeout(1.5),
    new Sleep().withTimeout(SleepTime),
    new DriveDistance(0.4, 18, simpleDrive),
    new Sleep().withTimeout(SleepTime),
    new TurnDegreesGyro(0.5, -112.5, simpleDrive).withTimeout(3),
    new Sleep().withTimeout(SleepTime),
    new DriveDistance(0.4, 27, simpleDrive),
    new Sleep().withTimeout(SleepTime),
    new TurnDegreesGyro(0.5, 112.5, simpleDrive).withTimeout(3),
    new Sleep().withTimeout(SleepTime),
    new DriveDistance(0.4, 18, simpleDrive),
    new Sleep().withTimeout(SleepTime),
    new TurnDegreesGyro(0.5, 90, simpleDrive).withTimeout(1.5),
    new Sleep().withTimeout(SleepTime),
    new DriveDistance(0.4, 17, simpleDrive));
  }
}
