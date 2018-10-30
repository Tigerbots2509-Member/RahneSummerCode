/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  private final Talon LF = RobotMap.DT_LEFTFRONT;
  private final Talon LB = RobotMap.DT_LEFTREAR;
  private final Talon RF = RobotMap.DT_RIGHTFRONT;
  private final Talon RB = RobotMap.DT_RIGHTREAR;
  public final ADXRS450_Gyro GYRO = RobotMap.DT_GYRO;
  private final RobotDrive DT = RobotMap.DRIVETRAIN;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public static void drive(Joystick dasStick) {
  }

  public ADXRS450_Gyro getGyro() {
    return GYRO;
  }

  public RobotDrive getDrive() {
    return DT;
  }

  public Talon getLF() {
    return LF;
  }

  public Talon getRF() {
    return RF;
  }

  public Talon getRB() {
    return RB;
  }

  public Talon getLB() {
    return LB;
  }
}
