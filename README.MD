# springboot-sample-app
<p align="center">
  <img src="https://miro.medium.com/max/1200/1*wUsUWiM0o5H-CVNnnD-QUg.png" />
</p>

## Problem: 

**this problem is to develop an android app, however to understand all about to be a web developer is modified to show in a web service. This repository has a backend code**

*You must build a mobile application that allows you to register doctors and associate it with patients In essence you should develop the CRUD of doctor, patient and history of the patient. Both the visual part (layouts) and the backend must be done respective.*

**The information to register for doctor is:**
- Professional Card Code 
- Specialty 
- Years of Experience
- Office
- Home delivery 
**The information to register for the patient is:**
- Names
- Surname
- Date of birth
- Identification
- Assigned doctor
- Are you in treatment?
- Moderating Fee Value
- Date and time of new appointment
- It must be possible to assign appointments to patients taking into account that they can
assign a different doctor at each appointment, therefore it is necessary to register and
can check the history of appointments of a patient, as well as of patients attended
by a doctor.
- The first screen of the application should show two options called: Doctors and
Patients. When clicking on Patients, the application must show the list of
existing patients (or empty if none have been admitted yet), and allow adding a
new patient, edit an existing one or delete one. The same can be done for the
Doctors case. However, a doctor cannot be deleted if you have appointments
valid with a patient (the respective message must be displayed on the screen). A) Yes
it cannot be deleted, if you have treated patients in the history. For this last case
you must show a confirmation dialog to allow cascading to clear the
history too.
- You must persist the information in the mobile device database to
Store patient, doctor and history info.


## Introduction to this code: 

This is a CRUD medical sample in a rest service to be used in frontend with angular service.

This project has entities like
-Doctor
-Patient
-Cita
Everyone entities have interaction with a model, service, and repository, also it is implemented a unitary test to probe the correct behavior of the different process about service with models and entities to manage the data in the Oracle database

## What you'll need

* A computer!
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [Maven 3](https://maven.apache.org)
* [Oracle Database](https://www.oracle.com/co/database/)
* A text editor
* Some experience with programming. Understanding of concepts like `if`, variables, functions etc.
* Comfortable with using the terminal and maybe spring suite (is like Eclipse environment)

## Project
This repository has a project called Development, if you want, you can help in solve some issues

## Do you have concerns about the code?
Please contact me, this is my email: andresinsuastyd10@gmail.com
