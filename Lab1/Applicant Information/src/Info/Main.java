/*Created by: Ambal, Justine Cedrick R.
* Section: BSIT 2102
* Subject: OOP
* */

package Info;
public class Main {
    public static void main(String[] args) {

        personal_Info p = new personal_Info();
        personal_Info p1 = new personal_Info();

        contact_Info c = new contact_Info();
        contact_Info c1 = new contact_Info();

        applicant_Requirement r = new applicant_Requirement();
        applicant_Requirement r1 = new applicant_Requirement();

        applicant_Status s = new applicant_Status();
        applicant_Status s1 = new applicant_Status();

        Separator l = new Separator();

        p.first_Name = "Alya ";
        p.middle_Initial = "Romen ";
        p.last_Name = "Segundo ";
        p.age = 29;
        p.Sex ='F';
        p.birth_date = "10/20/1994";


        c.address = "Baryo 3, San Miguel, Cabuyao , Philippines";
        c.Contact_no = "09098797621";
        c.email_Address = "AlyaSegundo12@example.com";

        r.Resume = "Reviewed";
        r.ID = "Valid";
        r.police_Clearance = "Verified";
        r.Experience = "6 Years of Experience on the same field";

        s.position_Application = "IT";
        s.applicant_Status = "Accepted";
        s.requirement_Status = "Complete and verified";

        p1.first_Name = "Homer ";
        p1.middle_Initial = "Urat ";
        p1.last_Name = "Pillo ";
        p1.age = 25;
        p1.Sex ='M';
        p1.birth_date = "10/20/1999";

        c1.address = "Sitio matanghuyin, San Nicolas, Cabuyao , Philippines";
        c1.Contact_no = "09093918275";
        c1.email_Address = "HomerPillo445@example.com";

        r1.Resume = "Reviewed";
        r1.ID = "Valid";
        r1.police_Clearance = "Verified";
        r1.Experience = "3 Years of Experience on the same field";

        s1.position_Application = "IT";
        s1.applicant_Status = "Pending";
        s1.requirement_Status = "Complete and verified";

        //Just change p, c, r and s with p1, c1, r1, and s1 correspondingly and vice versa
        // l.l is the line so no need to change it

        System.out.println(l.l);
        System.out.println("Applicant Personal Info");
        System.out.println("Name: " + p.first_Name + p.middle_Initial + p.last_Name);
        System.out.println("Age: "+p.age);
        System.out.println("Sex: "+p.Sex);
        System.out.println("Birth Day: "+p.birth_date);
        System.out.println(l.l);

        System.out.println(l.l);
        System.out.println("Contact Information "  );
        System.out.println("Contact number: "+c.Contact_no);
        System.out.println("Email: "+c.email_Address);
        System.out.println("Address: "+c.address);
        System.out.println(l.l);

        System.out.println(l.l);
        System.out.println("Requirement Status");
        System.out.println("Resume: "+r.Resume);
        System.out.println("Police Clearance: "+r.police_Clearance);
        System.out.println("Applicant ID: "+r.ID);
        System.out.println("Applicant Experience: "+r.Experience);
        System.out.println(l.l);

        System.out.println(l.l);
        System.out.println("Applicant Status");
        System.out.println("Position to be Applied: " +s.position_Application);
        System.out.println("Application Status: "+ s.applicant_Status);
        System.out.println("Requirement Status: "+ s.requirement_Status);
        System.out.println(l.l);

    }
}