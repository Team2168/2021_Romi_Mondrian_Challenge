// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class MondrianHardCoded extends SequentialCommandGroup {
  /** Creates a new MondrianHardCoded. */
  public MondrianHardCoded(Drivetrain simpleDrive) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());

    addCommands(new DriveDistance(0.4, 12, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, -45, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 7, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, -45, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 11, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, -90, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 7, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, -45, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 12, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, 45, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 8, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, 90, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 10, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, 45, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 7, simpleDrive),
      new Sleep().withTimeout(0.3),
      new TurnDegreesGyro(0.5, 45, simpleDrive).withTimeout(1.5),
      new Sleep().withTimeout(0.3),
      new DriveDistance(0.4, 12, simpleDrive));
  }
}
