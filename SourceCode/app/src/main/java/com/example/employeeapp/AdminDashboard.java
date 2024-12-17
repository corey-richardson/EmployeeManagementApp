package com.example.employeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AdminDashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_admin_dashboard);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void launchEmployeeDetails(View v)
    {
        Intent iLaunchEmployeeDetails = new Intent(this, EditPersonalDetails.class);
        startActivity(iLaunchEmployeeDetails);
    }

    public void launchHolidayRequests(View v)
    {
        Intent iLaunchHolidayRequests = new Intent(this, ptoMenu.class);
        startActivity(iLaunchHolidayRequests);
    }

    public void launchSettings(View v)
    {
        Intent iLaunchSettings = new Intent(this, Settings.class);
        startActivity(iLaunchSettings);
    }

    public void launchAEmployeeDetails(View v)
    {
        Intent iLaunchAEmployeeDetails = new Intent(this, aEmployeeDetails.class);
        startActivity(iLaunchAEmployeeDetails);
    }

    public void launchPtoRequests(View v)
    {
        Intent iLaunchPtoRequests = new Intent(this, aPtoRequests.class);
        startActivity(iLaunchPtoRequests);
    }

    public void launchAddEmployee(View v)
    {
        Intent iLaunchAddEmployee = new Intent(this, aAddEmployee.class);
        startActivity(iLaunchAddEmployee);
    }

    public void handleLogout(View v)
    {
        Intent iLogout = new Intent(this, MainActivity.class);

        // Clear the back stack to prevent going back to this activity
        iLogout.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(iLogout);
        finish();
    }
}