// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class TurnDegreesGyro extends CommandBase {
  private final Drivetrain m_drive;
  private final double m_degrees;
  private final double m_speed;
  private static final double MAXSPEED = 0.35;
  private static final double MINSPEED = 0.16;
  private static final double kP = 0.008;

  /**
   * Creates a new TurnDegrees. This command will turn your robot for a desired rotation (in
   * degrees) and rotational speed.
   *
   * @param speed The speed which the robot will drive. Negative is in reverse.
   * @param degrees Degrees to turn. Leverages encoders to compare distance.
   * @param drive The drive subsystem on which this command will run
   */
  public TurnDegreesGyro(double speed, double degrees, Drivetrain drive) {
    m_degrees = degrees;
    m_speed = speed;
    m_drive = drive;
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // Set motors to stop, read encoder values for starting point
    m_drive.arcadeDrive(0, 0);
    m_drive.resetEncoders();
    m_drive.resetGyro();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double speed;
    if (m_drive.getGyroAngleZ() < m_degrees) {
      // Clockwise
      speed = (MINSPEED + (m_degrees - m_drive.getGyroAngleZ()) * kP);
      if (speed > MAXSPEED) {
        speed = MAXSPEED;
      }
    } else {
      // Counter-clockwise
      speed = (-MINSPEED + (m_degrees - m_drive.getGyroAngleZ()) * kP);
      if (speed < -MAXSPEED) {
        speed = -MAXSPEED;
      }
    }
    m_drive.arcadeDrive(0, speed);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_drive.arcadeDrive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
      return Math.abs(m_drive.getGyroAngleZ() - m_degrees) < 0.5;
  }
}
