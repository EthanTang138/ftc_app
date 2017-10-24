package org.firstinspires.ftc.team8923_2017;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
@Autonomous(name="Autonomous Competition", group = "Swerve")
/**
 * Runable shell for Master Autonomous code
 */
//@Disabled
public class AutonomousCompetition extends MasterAutonomous
{
    //Declare variables here

    @Override
    public void runOpMode() throws InterruptedException
    {
        //ChooseOptions();

        InitAuto();//Initializes Hardware and sets position based on alliance

        waitForStart();

        //DropJJ();
        //sleep(2000);
        //RetreiveJJ();
        //sleep(1000);
        MoveIMU(50, 0.0, 0.085, 0.3, 1);//moveMM, targetAngle, kAngle, speed, timeout

        while (opModeIsActive())
        {
            //Run();
            idle();
        }

    }
}
