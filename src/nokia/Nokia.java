package nokia;
import java.util.Scanner;
public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Menu:");
        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", "1.Phonebook", "2.Message", "3.Chat", "4.Call register", "5.Tones",
                "6.Settings", "7.call divert", "8.Games", "9.Calculator", "10.Reminder", "11.Clock", "12.Profile", "13.Sim services");
        System.out.println(" ");
        System.out.println("Select Phone Options: ");
        int option = input.nextInt();
        switch (option) {
            case 1:
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", ">Phonebook>", "1.Search", "2.Service Nos",
                        "3.Add number", "4.Erase", "5.Edit",
                        "6.Assign Tone", "7.Send b'card", "8.Option", " 1.Type of view", " 2.Memory Status",
                        "9.Speed dail", "10.Voice tags");

                System.out.printf("%n%s%n%s%n", "phonebook ", ">open sub-folder");
                int subOption = input.nextInt();
                System.out.println(">Phone book");
                switch (subOption) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add number");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign Tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 9:
                        System.out.println("Speed dail");
                        break;
                    case 10:
                        System.out.println("Voice Tags");
                        break;
                    case 8:
                        System.out.printf("%n%s%n%s%n", "Option", ">Open sub-folder");
                        int Option = input.nextInt();
                        switch (Option) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory Status");
                                break;
                        }


                }
                break;
            case 2:
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n", ">Message", "1.Write Message", "2.Inbox", "3.Outbox", "4.Picture Messages", "5.Templates",
                        "6.Smileys", "7.Message Settings", "8.Info Service", "9.Voice Mailbox Number", "10.Service Commannd Editor");
                System.out.printf("%n%s%n%s%n", ">Message", ">open sub-folder");
                int subOption2 = input.nextInt();
                switch (subOption2) {
                    case 1:
                        System.out.println("Write Message");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture Message");
                        break;
                    case 5:
                        System.out.println("Template");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.printf("%n%s%n%s%n%s%n  ", "Message settings: ", " > 1.Set 1", " > 2.Common");
                        int messageSettings = input.nextInt();
                        switch (messageSettings) {
                            case 1:
                                System.out.printf("%n%s%n%s%n%s%n", "Set 1", ">1.Messaga center number", ">2.Message sent as", ">3.Message validity");
                                int set1 = input.nextInt();
                                switch (set1) {
                                    case 1:
                                        System.out.println("Messaga center number");
                                        break;
                                    case 2:
                                        System.out.println("Message sent as");
                                        break;
                                    case 3:
                                        System.out.println("Message validity");
                                        break;
                                }
                            case 2:
                                System.out.printf("%n%s%n%s%n%s%n%s%n", "Common", ">1.Delivery Reports", ">2.Reply via same centre", ">3.Character support");
                                int common = input.nextInt();
                                switch (common) {
                                    case 1:
                                        System.out.println("Delivery Reports");
                                        break;
                                    case 2:
                                        System.out.println("Reply via same centre");
                                        break;
                                    case 3:
                                        System.out.println("Character support");
                                        break;
                                }
                        }
                    case 8:
                        System.out.println("Info service");
                        break;
                    case 9:
                        System.out.println("Voice mail box number");
                        break;
                    case 10:
                        System.out.println("Service command editor");
                        break;
                }
                break;
            case 3:
                System.out.println("Chat");
                break;
            case 4:
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n", "Call Register", "1.Missed calls", "2.Received calls", "3.Dialled numbers",
                        "4.Erase recent call lists", "5.Show call duration");
                System.out.printf("%n%s%n%s%n", "Call register", ">open sub-folder");
                int callRegister = input.nextInt();
                switch (callRegister) {
                    case 1:
                        System.out.println("Missed calls");
                        break;
                    case 2:
                        System.out.println("Received calls");
                        break;
                    case 3:
                        System.out.println("Dialled numbers");
                        break;
                    case 4:
                        System.out.println("Erase recent call lists");
                        break;
                    case 5:
                        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n", "Show call duration", " >1.Last call Duration", " >2.All Calls' duration",
                                " >3.Receive call's duration", " >4.Dilled calls duration", " >5.Clear Timer");
                        System.out.printf("%n%s%n%s%n", "Show Call Duration", "open sub-folder");
                        int showCallDuration = input.nextInt();
                        switch (showCallDuration) {
                            case 1:
                                System.out.println("Last call Duration");
                                break;
                            case 2:
                                System.out.println("All Calls' duration");
                                break;
                            case 3:
                                System.out.println("Receive call's duration");
                                break;
                            case 4:
                                System.out.println("Dilled calls duration");
                                break;
                            case 5:
                                System.out.println("Clear Timer");
                        }
                    case 6:
                        System.out.printf("%n%s%n%s%n%s%n%s%n", "Show Call Cost", " >1.Last call cost", " >2.All calls' cost", ">3.Clear Counters");
                        System.out.printf("%n%s%n%s%n", "Show call cost", ">open sub-folder");
                        int showCallCost = input.nextInt();
                        switch (showCallCost) {
                            case 1:
                                System.out.println("Last call cost");
                                break;
                            case 2:
                                System.out.println("All calls' cost");
                                break;
                            case 3:
                                System.out.println("Clear Counters");
                                break;
                        }
                        break;
                    case 7:
                        System.out.printf("%n%s%n%s%n", "Call Cost Settings", " >1.Show Cost Limit", " >2.Show cost in");

                        System.out.printf("%n%s%n%s", "Call Cost Settings", " >open sub-folder");
                        int callCostSettings = input.nextInt();
                        switch (callCostSettings) {
                            case 1:
                                System.out.println("Show Cost Limit");
                                break;
                            case 2:
                                System.out.println("Show cost in");
                                break;
                        }
                        break;
                    case 8:
                        System.out.println("Prepaid credit");
                        break;
                }
                break;
            case 5:
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","Tone"," >1.Ringing tone"," >2.Ringing Volume"," >3.Incoming call alert"," >4.Composer",
                                " >5.Message alert tone"," >6.Keypad tones", ">7.Warning and game tones", ">8. Vibrating alert", ">9.Screen saver");
                System.out.printf("%n%s%n%s%n","Tone","open sub-folder");
                int Tone = input.nextInt();
                switch (Tone){
                    case 1:
                        System.out.println("Ringing Tone");
                        break;
                    case 2:
                        System.out.println("Incoming Call Alert");
                        break;
                    case 3:
                        System.out.println("Composer");
                        break;
                    case 4:
                        System.out.println("Message Alert Tone");
                        break;
                    case 5:
                        System.out.println("Keypad Tones");
                        break;
                    case 6:
                        System.out.println("Warning And Game Tones");
                        break;
                    case 7:
                        System.out.println("Vibrating Alert");
                        break;
                    case 8:
                        System.out.println("Screen Saver");
                        break;
                }
                break;
            case 6:
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n","Settings"," >1.Call settings"," >2.Phone settings"," >3.Security settings"," >4.Restore factory setting");
                System.out.printf("%n%s%n%s%n", "Settings"," >open sub-folder");
                int Settings = input.nextInt();
                switch (Settings){
                    case 1:
                        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","Call settings"," >1.Automatic redail"," >2.Speed dailing"," >3.Call waiting options",
                                            " >4.Own number sending"," >5.Phone line in use"," >6.Automatic answer");
                        System.out.printf("%n%s%n%s%n","Call setings"," >open sub-folder");
                        int callregister = input.nextInt();
                        switch (callregister){
                            case 1:
                                System.out.println("Automatic Redail");
                                break;
                            case 2:
                                System.out.println("Speed Dailing");
                                break;
                            case 3:
                                System.out.println("Call Waiting Options");
                                break;
                            case 4:
                                System.out.println("Own Number Sending");
                                break;
                            case 5:
                                System.out.println("Phone Line In Use");
                                break;
                            case 6:
                                System.out.println("Automatic Answer");
                                break;
                        }
                        break;
                    case 2:
                        System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","Phone settings"," >1.Language"," >2.Cell info display"," >3.Welcome note"," >4.Network selection",
                                        " >5.Light"," >6.Confirm SIM service actions");
                        System.out.printf("%n%s%n%s%n","phone Setting","open sub-folder");
                        int phoneSettings = input.nextInt();
                        switch (phoneSettings){
                            case 1:
                                System.out.println("Language");
                                break;
                            case 2:
                                System.out.println("Cell Info Display");
                                break;
                            case 3:
                                System.out.println("Welcome Note");
                                break;
                            case 4:
                                System.out.println("Network Selection");
                                break;
                            case 5:
                                System.out.println("Light");
                                break;
                            case 6:
                                System.out.println("Confirm SIM service actions");
                                break;
                        }
                        break;
                    case 3:
                        System.out.printf("%n%s%n%s%n%s%n%s%n","Security settings"," >1.Pin code request"," >2.Call barring service"," >3.Fixed dialing",
                                                " >4.Closed user group",">5.Phone security",">6.Change access codes");
                        System.out.printf("%n%s%n%s%n","Security Settings",">open Sub-folder");
                        int securitySettings = input.nextInt();
                        switch (securitySettings){
                            case 1:
                                System.out.println("Pin Code Request");
                                break;
                            case 2:
                                System.out.println("Call Barring Service");
                                break;
                            case 3:
                                System.out.println("Fixed Dialing");
                                break;
                            case 4:
                                System.out.println("Closed User Group");
                                break;
                            case 5:
                                System.out.println("Phone Security");
                                break;
                            case 6:
                                System.out.println("Change Access Codes");
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("Restore factory setting");
                        break;
                }
                break;
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println("Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n","Clock"," >1.Alarm clock"," >2.Clock settings"," >3.Date settings"," >4.Stopwatch",
                                    " >5.Countdown timer"," >6.Auto update of date and time");

                System.out.printf("%n%s%n%s%n", "Clock"," >Open sub-folder");
                int clock = input.nextInt();
                switch (clock){
                    case 1:
                        System.out.println("Alarm Clock");
                        break;
                    case 2:
                        System.out.println("Clock Settings");
                        break;
                    case 3:
                        System.out.println("Date Settings");
                        break;
                    case 4:
                        System.out.println("Stopwatch");
                        break;
                    case 5:
                        System.out.println("Countdown Timer");
                        break;
                    case 6:
                        System.out.println("Auto Update Of Date And Time");
                        break;
                }
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("Sim Services");
        }

    }
}