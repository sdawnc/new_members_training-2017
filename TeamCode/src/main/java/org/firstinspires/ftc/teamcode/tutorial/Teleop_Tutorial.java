package org.firstinspires.ftc.teamcode.tutorial;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.util.Range;

/**
 * Created by Student on 8/12/2017.
 * SET-UP
 */
@TeleOp(name="Teleop_Tutorial")
@Disabled
public class Teleop_Tutorial extends OpMode {
/*
Servos power scaled 0 to 1
Motors power scaled -1 to 1

*/
    private DcMotor leftMotor;
    private DcMotor rightMotor;
    private Servo arm;

    @Override
    public void init() {
        //hardware map
        //assumed that they will go forward
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        arm = hardwareMap.servo.get("arm");

        //have to reverse one motor so it doesn't spin
        leftMotor.setDirection(DcMotor.Direction.REVERSE);
    }

    @Override
    public void start() {
        //sets all powers to 0 before robot starts to move
        leftMotor.setPower(0.0);
        rightMotor.setPower(0.0);
        arm.setPosition(0.0);

    }

    @Override
    public void loop() {
        //map controls

        arcadeDrive(-1*gamepad1.left_stick_y, gamepad1.right_stick_x);
    }

    @Override
    public void stop() {
        //setting power to 0
    }


    public void arcadeDrive(double power, double turn){
        double leftPower = Range.clip(power + turn, -1, 1);
        double rightPower = Range.clip(power - turn, -1, 1);

        leftMotor.setPower(leftPower);
        rightMotor.setPower(rightPower);

    }
}