package org.firstinspires.ftc.teamcode.tutorial;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by Student on 8/14/2017.
 */
public class Autonomous_Practice {
    @Autonomous(name="Autonomous_Practice");

    public class Autonomous_Tutorial extends LinearOpMode {
        //Declare and initialize variables
        private DcMotor leftMotor;
        private DcMotor rightMotor;
        private ElapsedTime runTime = new ElapsedTime();

        @Override
        public void runOpMode() throws InterruptedException {
            //set up HW map and direction
            leftMotor = hardwareMap.dcMotor.get("left_drive");
            rightMotor = hardwareMap.dcMotor.get("right_drive");
            leftMotor.setDirection(DcMotor.Direction.REVERSE);



    }
