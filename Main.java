import java.awt.desktop.UserSessionEvent;
import java.util.List; //import list class
import java.util.Scanner; //import scanner class
import java.util.Random; //import random class

class Main {
  public static void main(String[] args) {
    String[] highScores = {"0", "0", "0", "0", "0", "0"}; //initialize an array to hold the six highest scores and another array to hold their corresponding players
    System.out.println("Hi there! We advise you to enlarge your console and zoom out for the best experience. Thank you!!!");    
    System.out.println("\n\nWelcome to...");
    
    System.out.println("                                                                   :5PPP5?7:              ~??????~                                                                                                      ");
    System.out.println("                                                                    :@@@@@@@.              #@@@@@@G                                                                                                     ");
    System.out.println("                                                                    :@@@@@@@.              #@@@@@@G                                                                                                     ");
    System.out.println("                                                                    J@@@@@@&              .@@@@@@@~                                                                                                     ");
    System.out.println("                                                                    #@@@@@@5              ?@@@@@@@                                                                                                      ");
    System.out.println("                                                             :7YYYY5@@@@@@@BJYYYYYYYYY^   B@@@@@@&YYYYYYYYYYYYYYYY!     .7YYYYYYYYYYYYYYYYYYYYY?:                                                       ");
    System.out.println("                                                            7@@@@@@@@@@@@@@@@@@@@@@@@@!  .@@@@@@@@@@@@@@@@@@@@@@@@@G   !@@@@@@@@@@@@@@@@@@@@@@@@@.                                                      ");
    System.out.println("                                                            &@@@@@@@@@@@@@@@@@@@@@@@@&   ~@@@@@@@@@@@@@@@@@@@@@@@@@G   &@@@@@@@@@@@@@@@@@@@@@@@@@.                                                      ");
    System.out.println("                                                           ^@@@@@@@@@@@@@@@@@@@@@&&&P.   P@@@@@@@@@@@@@@@@@@@@@@@@@7  ^@@@@@@@@@@@@@@@@@@@@@@@@@#                                                       ");
    System.out.println("                                                                  !@@@@@@@:              &@@@@@@Y          !@@@@@@@.  5@@@@@@@!~~~~~~~~~7@@@@@@@J                                                       ");
    System.out.println("                                                                  Y@@@@@@&              :@@@@@@@:          5@@@@@@#   &@@@@@@@@@@@@@@@@@@@@@@@@@:                                                       ");
    System.out.println("                                                                  &@@@@@@Y              J@@@@@@&           &@@@@@@Y  :@@@@@@@@@@@@@@@@@@@@@@@@@#                                                        ");
    System.out.println("                                                                 :@@@@@@@:              #@@@@@@P          :@@@@@@@:  ?@@@@@@@@@@@@@@@@@@@@@@@@&:                                                        ");
    System.out.println("                                                                 J@@@@@@&. .........   .@@@@@@@~          J@@@@@@&   B@@@@@@&7????????????!~:.                                                          ");
    System.out.println("                                                                 #@@@@@@@@@@@@@@@@@&   7@@@@@@@           #@@@@@@P  .@@@@@@@@@@@@@@@@@@@@@&&#!                                                          ");
    System.out.println("                                                                .@@@@@@@@@@@@@@@@@@P   G@@@@@@G          .@@@@@@@~  ~@@@@@@@@@@@@@@@@@@@@@@@@@                                                          ");
    System.out.println("                                                                :@@@@@@@@@@@@@@@@@&.  .@@@@@@@:          7@@@@@@B   ~@@@@@@@@@@@@@@@@@@@@@@@@@.                                                         ");
    System.out.println("                                                                 :7JJJJJJJJJJJJJ?~    .JJJJJ~.           ^JJJJ?^     ^?JJJJJJJJJJJJJJJJJJJJJJ?                                                          ");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("                  .!JJJJJJJJJJJJJJJJJJJJJ7:    ~JJJJJJJJJJJJJJJJJJJJJJJJ    ^7JJJJJJJJJJJJJJJJJJJJJJY.  ~YJJJJJJJJJJJJJJJJJJJJJJ!     .~JJJJJJJJJJJJJJJJJJJJJ?^     ^?JJJJJJJJJJJJJJJJJJJJJ~            ");
    System.out.println("                 ~@@@@@@@@@@@@@@@@@@@@@@@@@.  #@@@@@@@@@@@@@@@@@@@@@@@@&   G@@@@@@@@@@@@@@@@@@@@@@@@@.  G@@@@@@@@@@@@@@@@@@@@@@@@B   :@@@@@@@@@@@@@@@@@@@@@@@@@~   B@@@@@@@@@@@@@@@@@@@@@@@@5           ");
    System.out.println("                 &@@@@@@@@@@@@@@@@@@@@@@@@@. 7@@@@@@@@@@@@@@@@@@@@@@@@@7  ^@@@@@@@@@@@@@@@@@@@@@@@@@P   5@@@@@@@@@@@@@@@@@@@@@@@@B   G@@@@@@@@@@@@@@@@@@@@@@@@@~  !@@@@@@@@@@@@@@@@@@@@@@@@@5           ");
    System.out.println("                :@@@@@@@@@@@@@@@@@@@@@@@@@#  B@@@@@@@@@@@@@@@@@@@@@&&#7   Y@@@@@@@@@@@@@@@@@@@@@@&&5    .G&@@@@@@@@@@@@@@@@@@@@@@?   @@@@@@@@@@@@@@@@@@@@@@@@@@.  B@@@@@@@@@@@@@@@@@@@@@@@@@~           ");
    System.out.println("                Y@@@@@@@!^~~~~~~~^7@@@@@@@Y .@@@@@@@B7????????????7^:     &@@@@@@P                       .:^~~~~~~~~~~~~~5@@@@@@@:  ^@@@@@@@~          B@@@@@@B  .@@@@@@@P^~~~~~~~~~G@@@@@@@.           ");
    System.out.println("                #@@@@@@@@@@@@@@@@@@@@@@@@@: !@@@@@@@@@@@@@@@@@@@@@@@@&.  .@@@@@@@^                     P@@@@@@@@@@@@@@@@@@@@@@@@&   5@@@@@@#           &@@@@@@?  ~@@@@@@@@@@@@@@@@@@@@@@@@@B            ");
    System.out.println("               .@@@@@@@@@@@@@@@@@@@@@@@@@&  G@@@@@@@@@@@@@@@@@@@@@@@@@^  ?@@@@@@&                     7@@@@@@@@@@@@@@@@@@@@@@@@@5   &@@@@@@Y          ^@@@@@@@.  P@@@@@@@@@@@@@@@@@@@@@@@@@!            ");
    System.out.println("               7@@@@@@@@@@@@@@@@@@@@@@@@&:  J@@@@@@@@@@@@@@@@@@@@@@@@@.  B@@@@@@G                     B@@@@@@@@@@@@@@@@@@@@@@@@@^  :@@@@@@@:          5@@@@@@&   &@@@@@@@@@@@@@@@@@@@@@@@@5             ");
    System.out.println("               B@@@@@@&?????????????7~:.     :~^!?????????????&@@@@@@#  .@@@@@@@!                    .@@@@@@@P7????????7B@@@@@@&   ?@@@@@@&.         .&@@@@@@Y  :@@@@@@@57???????????7!^.               ");
    System.out.println("               @@@@@@@@@@@@@@@@@@@@@&&#!   J@@@@@@@@@@@@@@@@@@@@@@@@@J  !@@@@@@@&&&&&&&&&&&&&&&&&&Y  !@@@@@@@@@@@@@@@@@@@@@@@@@G   B@@@@@@@@@@@@@@@@@@@@@@@@@^  J@@@@@@@@@@@@@@@@@@@@@&&P.              ");
    System.out.println("              ^@@@@@@@@@@@@@@@@@@@@@@@@@.  #@@@@@@@@@@@@@@@@@@@@@@@@@.  P@@@@@@@@@@@@@@@@@@@@@@@@@!  P@@@@@@@@@@@@@@@@@@@@@@@@@!  .@@@@@@@@@@@@@@@@@@@@@@@@@&   B@@@@@@@@@@@@@@@@@@@@@@@@Y              ");
    System.out.println("              ^@@@@@@@@@@@@@@@@@@@@@@@@@.  #@@@@@@@@@@@@@@@@@@@@@@@@5   P@@@@@@@@@@@@@@@@@@@@@@@@#   P@@@@@@@@@@@@@@@@@@@@@@@@B   ~@@@@@@@@@@@@@@@@@@@@@@@@@7   #@@@@@@@@@@@@@@@@@@@@@@@@P              ");
    System.out.println("               ^JJJJJJJJJJJJJJJJJJJJJJJJ   .!JJJJJJJJJJJJJJJJJJJJJ?:     !JJJJJJJJJJJJJJJJJJJJJJ~     !JJJJJJJJJJJJJJJJJJJJJ?^    P@@@@@@&JJJJJJJJJJJJJJJJ7.    .7JJJJJJJJJJJJJJJJJJJJJJY^              ");
    System.out.println("                                                                                                                                  &@@@@@@7                                                              ");
    System.out.println("                                                                                                                                 :@@@@@@@.                                                              ");
    System.out.println("                                                                                                                                 ?@@@@@@G                                                               ");
    System.out.println("                                                                                                                                ^@@@@@@B.                                                               ");
    System.out.println("                                                                                                                               ~55777^.                                                                 ");
    System.out.println("                                          JB######################&^   7B#####################G!    ~P#####################BJ     !G######################?                                             ");
    System.out.println("                                         B@@@@@@@@@@@@@@@@@@@@@@@@@.  P@@@@@@@@@@@@@@@@@@@@@@@@@.  !@@@@@@@@@@@@@@@@@@@@@@@@@~   5@@@@@@@@@@@@@@@@@@@@@@@@@.                                            ");
    System.out.println("                                        :@@@@@@@@@@@@@@@@@@@@@@@@@5  .@@@@@@@@@@@@@@@@@@@@@@@@@&   &@@@@@@@@@@@@@@@@@@@@@@@@@:   @@@@@@@@@@@@@@@@@@@@@@@@@@                                             ");
    System.out.println("                                        J@@@@@@@#BBBBBBBBBBBBBBPY~   ?@@@@@@@#BBBBBBBBB#@@@@@@@P  .@@@@@@@&BBBBBBBBBB@@@@@@@&   ~@@@@@@@##@@@@@@@&B@@@@@@@B                                             ");
    System.out.println("                                        #@@@@@@P                     G@@@@@@G          .@@@@@@@~  7@@@@@@@           #@@@@@@P   5@@@@@@# !@@@@@@@. &@@@@@@7                                             ");
    System.out.println("                                       .@@@@@@@~                     @@@@@@@!          !@@@@@@@.  G@@@@@@G          .@@@@@@@~   &@@@@@@Y G@@@@@@B ^@@@@@@@.                                             ");
    System.out.println("                                       7@@@@@@@                     ~@@@@@@@.          G@@@@@@B   @@@@@@@!          7@@@@@@@   :@@@@@@@: @@@@@@@7 5@@@@@@#                                              ");
    System.out.println("                                       G@@@@@@B                     P@@@@@@B           @@@@@@@7  ~@@@@@@@           G@@@@@@B   J@@@@@@& ^@@@@@@@. &@@@@@@Y                                              ");
    System.out.println("                                       @@@@@@@7                     &@@@@@@G^~~~~~~~~~Y@@@@@@@.  P@@@@@@&~~~~~~~~~~7@@@@@@@7   #@@@@@@P 5@@@@@@# :@@@@@@@^    .::^~~                                    ");
    System.out.println("                                      ^@@@@@@@.                    ^@@@@@@@@@@@@@@@@@@@@@@@@@#   &@@@@@@@@@@@@@@@@@@@@@@@@@.  .@@@@@@@~ &@@@@@@Y J@@@@@@&    B@@@@@@.                                   ");
    System.out.println("                                      5@@@@@@#                     ?@@@@@@@@@@@@@@@@@@@@@@@@@?  :@@@@@@@@@@@@@@@@@@@@@@@@@B   7@@@@@@& :@@@@@@@: #@@@@@@5   Y@@@@@@B                                    ");
    System.out.println("                                    .5@@@@@@&:                     ^@@@@@@@@@@@@@@@@@@@@@@@@G   .&@@@@@@@@@@@@@@@@@@@@@@@#. .?@@@@@@&~ J@@@@@@7 .@@@@@@B.   &@@@@@&:                                    ");
    System.out.println("                                    .^:::::.                         ::::::::::::::::::::::.      .:::::::::::::::::::::.   .^:::::.   .::::.    :::::.     :::::.                                      ");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("");
    System.out.println("                 .::::::::..  ..:::::::::.      .:::.      .::::::::..   .:::..   .:::.    .:::::::::..  ..:::::..      .:::::::::..  ..::.            .:::.      .::..   ..:::. .::^^:..               ");
    System.out.println("                ~&@@@@@@&&&#P ~#@@@&&&&&@#    .!#@@@&7.   .G@&@@@@@@&#G? ~G&@&G! J#@@#?.  !&@@@@@@@@@&! Y#&@@@@@&BJ:.  .J@@@@@@@&&&BJ ?&@@B:         .~B@@@&?.   .5&@@B   B@@&5 Y&@&&&&&#?.             ");
    System.out.println("               .!@@@@    &@@@ ?&@@@          :Y@@@ @@@P:  .^#@@@   G&@@@P  7B@@@&@@&Y:    !7JY#@@@#YJJ!#@@@B   #@@@B:   5@@@&   #@@@@ Y@@@&^        .J&@@ &@@G^.  .~P&@@ @@&P~. JPP   #@@#:             ");
    System.out.println("               .!@@@@@@@@@@@  7&@@@&####P^  ~B@@@   @@@#! ^#@@@B    #@@@B    7&@@@P^.         G@@@G:  !@@@@Y   5@@@&^   5@@@@@@@@@@&B Y@@@&!      .^G@@@   @@@#!.   .~B@@@#~.       .&&P?:              ");
    System.out.println("               .!@@@@Y??5&@@@ !&@@@         &@@&&&&&&&@@@Y #@@@@&&&@@@@#!     &@@@J.          G@@@G.   J&@@@&&&@@@&?    Y@@@&J?7!!    J@@@@&&&&&&G?&@@@&&&&&&@@@Y.   .P@@@G.       .B@7.                ");
    System.out.println("                :JY5J     Y55 :J5555555555 J55Y~      ^J55J^75555555YJ7^      7YYY^           ~YYY~.    :!J5PPP5J~.     ^YY5!         ^Y555555555??55Y       J55J:    ~YYY~        .7J.                 ");
    System.out.println("");
    System.out.println("                                                                                                                                                                                    @@                  ");
    System.out.println("");
    System.out.println("");
    System.out.println("(YES or NO)");
    
    Scanner input = new Scanner(System.in);
    String answer = input.nextLine(); //ascii art above asks if user would like to play

    while (answer.equalsIgnoreCase("yes")) {
      double score = 0;
      System.out.println("\nWhat is your name?"); // Asks for user name
      String name = input.nextLine();

      System.out.println("\nSilence... The blackness of the void... Who are you? You feel the sensation of a breeze on your eyelids, and slowly, you open your eyelids. You're standing in a white room with 4 walls and nothing else, other than a loudspeaker attached to one of the walls. It blares out the following message:\n'Hi there, " + name + "! Welcome to the Escape Room. Today's journey will be filled with trials and tribulations, but there is nothing you can't solve with a bit of contemplation and creativity. Good luck, player!'\nThe message stops, and you look around, confused. Suddenly, you feel a tugging sensation, and when you look down, you see that the wall across from you, which was blank just a second ago, now has 3 doors attached to it. Without any other option, you brace yourself to walk into one of the doors..."); 
      System.out.println(
          "\n1. The first door, on the left, is carved out from a tree trunk, with overgrown branches reaching out to you.\n2. The second door, in the middle, is made out of a chocolate bar, with a peppermint frame, topped with a large cherry.\n3. The third and final door on the right is a dark and empty void, scattered sparsely with glinting stars.");
      
      System.out.println("                               :                                                                            .!:                                                                                         ");
      System.out.println("                              .P~                                                                         .J5~                                                          .       .                       ");
      System.out.println("                              JPG:        .^7Y~                                                          .P?                                    :                               .       :7.  .          ");
      System.out.println("                            .JPPGJ      ~5GGGY                                                           7Y                                   .                                 .       ~@@&P:          ");
      System.out.println("                           :5P5PBJ     :GG5?:                                                     ^YGBBBPBGGGGPY~                             .                                       .^5G&@.           ");
      System.out.println("                           5PPPBP     . .                                       .....   !BPJ:   .G#P!^!BBBBBBBBB#B:   .JPB7   ......                     .                                 ^: :         ");
      System.out.println("                           JGGP7..^^^^^^:.                                   ..         JB#G....G#B7.:7BBBBBBBBBB&B~:..GBGJ        .:.                     .    :                                   .   ");
      System.out.println("                            ~?!^:..?PPGGGP5!.                              :BG^        .?77.   ^&BBBBBBBBBBBBBBB#&#:   .77?.        ~BB~                                           .                    ");
      System.out.println("                           !7:     ^5PPPPGBBG^                             JG#P^^      YBB~     Y#BBBBBBBBBBBBB##&!     ~BBY      :~B##P!.            .                    .                            ");
      System.out.println("                         .5~         ^!JYPGBBB:                           ^  ~^J#GJ~~~7#&G       J###BBBBBB###&&#7       P&B7~~~7GB~!!.:!7.           . ~&P            :                                ");
      System.out.println("           .:~!!77!~:    57                .:7?                           ^    ^P&&P!!^.~7.   .:^??Y5G######BBPJ7?~:.   .7Y7!:.7&BP:   :!7~             ...             .         :                     ");
      System.out.println("        :7Y5PPPPPPPPG5~ .G.     ..:~!7?7.?J5JPP5J!:                       ^      ?B?J!:..^PBB##&#5J?::7Y555YYJJJJYB&#BBBGYJJ~:..P~     :!7!          .                                                  ");
      System.out.println("      .JPPPPPPGGGGGGBB#!:G:   :?B&BBBB#&BBB&&#BB&&##7       ^JP^          P^     :7##B###BB######BBB##BBBB####BBBBB#########BBBB!      ?B?!         ..  :^:   ..                                        ");
      System.out.println("      ...    .:!YGBBBBBJ.5Y  ?#BB&#GGGB#&#G#&#GG##B&B    :5B##GPPY:       ##P:   :7&B#BBBBBBBBBB##B#BBBBBBBBBB##B#BBBBBBBBBB##G#7    ^P&&?!         ~~    #@&&~                                         ");
      System.out.println("                  :~??!  :GJ !#GB&#GGGGB&#GB&#GG#&B&#  .Y####GB##&&.      5B#Y:~.:7&##GGGGGGGGGGB&##GGGGGGGGGGB&##GGGGGGGGGGB&B#!  :^G##G7!              :#&&@                           :    .         ");
      System.out.println("                          ~B5Y#G#&#GGGBB##B#&#GG#&B&&.!B########&&J       ^.7?^BBYJ&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGGGGGB&##?7GY^PJ~~7!             ..   .:                   .                     ");
      System.out.println("                  .75PP.   ^P##B#&#BGGGB##B#&BGG###&&BB##B####&&5.        ^   .P##&&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGGGGGB&B####?.  :!7!                          .:          ~B:                    ");
      System.out.println("                :^~##&&B.   .Y#BG#&BGGGG##BB&BBGBBB&&###BB#B#&&!          ^     !B&&##BGGGGGGGGGB&##GGGGGGGGGGB&##GGGGGGGGGGB&B#&P~    :~7!                 .        ^!         .5@?.      :            ");
      System.out.println("~?!~^          YB&GPBB#&&^   :#BG###BGGGB#BB#BBBBGB&&#BGPP#&&#:           7      ^5&B##BBBBBBBBB#&##BBBBBBBBBBB&##BBBBBBBBBB#&B#Y      :J7!                          YB           :             .       ");
      System.out.println(" .75P5:       .P#B#&&#B#&&J   GBGG##BGGBBBBB#BBBBB##BGPPPG&&G             B5:    :7&BB##&&&&&&&&&#BB############BB############B#!     ^G&?!                  ::     !@@J          :             .       ");
      System.out.println("     .:~7!^^.   :P###&#GB#&B^ YPPPB#BBGBBBBBBBBBGGP55PPPP#&#              B#B?   :7&B#BGBBBBBBBBB#B#GGBBBBBBBB##B#GGBBBBBBBB##B#!   .Y#&#?!                       ^B@@@@#!                              ");
      System.out.println("   .~YGG?  .YG57^:YB####BB#&&55PPPP##BB##BB#BBBGPPPPPP5PB&&J              !?BY^57^7&##GGGGGGGGGGG&##GGGGGGGGGGB&##GGGGGGGGGGB&B#! !7^BB5?7!      .         .:^!JB@@@@@@@@@@#Y!^:..                      ");
      System.out.println(" ^?5P5J^      :~J5G####BBBB#BPPPPPPG#BB##BG##BBPPPPPPPGB##B^   ..         ^ .^^B#BG&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGGGGGB&B#GG#Y^!::~7!  .                  .~P@@@@@@G~.                            ");
      System.out.println("                   :?P###BGGP5PPPPPG##B##BGB##BGGPPGGGBBB5.:J5PPP55?^     ^    ~G#&&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGBBBGGB&B#&#G^   :!7!                         P@@B.               ~               ");
      System.out.println("              ..      5###BBBPPPPPPB##BB&#GGB##BBGGGBBB&#  !GGPPPGPPPP:   ^     .J#&##BGGGGGGGGGG&##GGGGGGGGGGB&##GGGB#Y^~5#B&B##~     :~7!                          G&                7@!     .        ");
      System.out.println("              !55J!:   5##BBBGPGPGGB##BBBBGGGBBBBBB####&J   7PPPPPPGPPP.  5:     :?&B#BBBBBBBBBBB&##BBBBBBBBBB#&##BBBJ5! ^?7Y#B#7      !G?!      .                   ~?            ..!B@@@B!.  .        ");
      System.out.println("               YPPGGY^  G##BBGG##GGGBBGGBBGGGGGBGBB####&~     :!J5PGBGB:  #BY:   :7&BB############BB############BB###^ :!.!~!###!    :5&&?!                          .^                ?@7              ");
      System.out.println("               !PPPPPGY.~B#BGGGGBBGB##BGGGPPPPPPPPG##&&&.         .~5#Y   PB#Y:^.:7&B#GGBBBBBBBBB#B#GGBBBBBBBBB#B#GGBBBG!.?&#&##!  .:G##G7!                                             !               ");
      System.out.println("               .PPPPGGPP.GBGGBBB#BGG##BGGPP5PPPPPGGB##&&.            :    ^.JJ^BGJJ&##GGGGGGGGGGG&##GGGGGGGGGGB&##GGGGBGGB###&B#?!PY^PY!!7!                                                             ");
      System.out.println("                .YGBB#BP.JGGG##B#BGB#######BGGGGGBBBB#&#                  ^   .P###&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGBBBGB&B####J.. :!7!                                                             ");
      System.out.println("                  .~!!~.!GBGG##B###BGP5555PGB#&&#BBB##&&                  ^     7B&&B#BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGGGGGB&B#&G7    :~7!                             . .                             ");
      System.out.println("                       75YBGB####GY?!~~~~^~~!7YB##BB###&.                 !      ^P&##BGGGGGGGGGG&##GGGGGGGGGGB&##GGGGGGGGGGB&B#5      :?7!                   ?&~     . ?.                              ");
      System.out.println("                       P:?BGB&##Y7!~~^^^~^~~~^~!5#&###&&~                 BY.    :7&B#BBBBBBBBBB#&##BBBBBBBBBB#&##BBBBBBBBBB#&B#!     :P#?!                   :P.      ~@@J^.                           ");
      System.out.println("                      .P.PBG###Y7~^~~~^~~~~~~~~~~5#&##&&?                 ##B7   :7&BB############BB############BB###########BB#!    JB&&?!                         .:?#@@@?.                           ");
      System.out.println("                      .P?#BG##G7~^~~~~^~~~^~~~~~^7B&###&G                 7YBY^Y!^7&B#GGBBBBBBBBB#B#GGBBBBBBBBB#B#GGBBBBBBBBB#B#! ^!^B#PJ7!                             :#.                             ");
      System.out.println("                       Y##BB##5!~~~~~~^^~~^~~~~~~!P###B&&.                ^ .~^B#BP&##GGGGGGGGGGG&##GGGGGGGGGGB&##GGGGGGGGGGB&B#PP#Y^?^:~7!                 .      ?.    .                              ");
      System.out.println("                       5BBB&&B!~^^^^^^^^^~^^^^^^^^~G####&:                ^    7B&&&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGGGGGB&B#&#B~   :!7!                        ^.                                   ");
      System.out.println("                      ^BGB&###5!~^~~^~^^^~^~^^~^~~Y##B##&J                ^     .Y#&##BGGGGGGGGGB&##BGGGGGGGGGB&##GGGGGGGGGGB&B##7.    :~7!                                                             ");
      System.out.println("                  ...:GBB&#B##G7~^~~^~^~^~^~~^~^~^5&#B##&&!               5.     :?&##BGGGGGGGGGG&##GGGGGGGGGGB&##GGGGGGGGGGB&B#7      ~P?!             .                 . .                           ");
      System.out.println("        ..:^^~~~!!!!?B#B#&BG##B?!^~~^~~~^~^~~^~^~^5&#B##&&&Y^::..         #BJ.   :7&B##BBBBBBBBB#&###BBBBBBBBB#&##BBBBBBBBBB#&B#!    .J#&?!                                                .            ");
      System.out.println("   .^~~!!!!!!!!!!7?YBBBB#######Y7^~~^^~~^~^~~~~^~^P&&#####B&P!!!!~~:.     ###5^..:7##B############BB############BB##############!  .^G#&#?!                               ..                            ");
      
      System.out.println("\nEach door begins glowing, as if to beckon you closer. You have no choice but to pick a door. (ENTER A NUMBER FROM 1 - 3)! Choose wisely..."); // Gives user door options

      String doorChoice = input.next();

      while (!doorChoice.equals("1") && !doorChoice.equals("2") && !doorChoice.equals("3")) { // Error trap any number other than 1, 2, or 3
        System.out.println("You search far and wide but cannot find a door labeled " + doorChoice
            + ". Only three doors stand before you.");
        System.out.println("\nWhich door do you choose?");
        System.out.println("1. The jungle door 🌴");
        System.out.println("2. The candy door 🍭");
        System.out.println("3. The space door 🪐");

        doorChoice = input.next();
      }

      if (doorChoice.equals("1")) { // Takes user input and calls whatever method it pertains to
        score = jungleRoom();
      }

      if (doorChoice.equals("2")) {
        score = candyRoom();
      }

      if (doorChoice.equals("3")) {
        score = spaceRoom();
      }

      System.out.println("Your final score is: " + score); // Gives user final score and asks user if they'd like to play again

      highScores = getLeaderboard(name, score, highScores); //run the leaderboard method to display the top 6 scores

      System.out.println("\nLeaderboard:"); //print the leaderboard
      for (int i = 0; i < 6; i++){
        if (!highScores[i].equals("0")) //only print if the element in the array is not the placeholder 0
        {
          System.out.println((i+1) + ". " + highScores[i]); 
        }else{
          System.out.println((i+1) + "."); //otherwise print a blank placeholder for the position
        }
      }
      
      System.out.println("\nWould you like to play again?");
      System.out.println("Yes - Play Again");
      System.out.println("No - Exit Game");

      answer = input.next();
      input.nextLine(); // prevents skipping the next input
    }

    input.close(); // close input stream
  }

  public static int jungleRoom() {
    
    Scanner input = new Scanner(System.in);
    String[] possibleKeywords = { "adventure", "totem pole", "labyrinth", "climbing vine", "capybara", "green anaconda" }; // Make a list of all possible hangman words for this room
    int numGuesses = 3;

    System.out.println(
        "\nBefore you even have a chance to reach for the doorknob, the vines from the jungle tree start to reach out, curling and twisting, and dragging you inwards, almost as if the door is aware that you were eyeing it. \nBefore you know it, you're inside and the door slams shut. You turn around in shock, only to spot a hangman puzzle engraved onto the door, with no clues or hints or anything. You're trapped!\nShaking, you look around, and realize that past the thicket of trees, there are objects all around the room. Afraid, but with no other option, you start the journey.");
    System.out.println("\nGOAL: Examine all the items in the room. Every puzzle you solve will grant you another guess at the secret word holding you in.");
    System.out.println("READY? GO!");
    String[] objects = { "Venus Flytrap", "Labyrinth", "Lion", "Map", "Locked Door" }; // array of objects that the player may explore
    
    boolean keepExploring = true; // initialize a boolean to determine if the code will keep prompting the user to  explore another object

    while (keepExploring) { // will iterate as long as keepExploring is true
      System.out.println("\nWhich item would you like to examine?");

      for (int i = 0; i < objects.length; i++) {
        if (!objects[i].equals("")) {
          System.out.println(i + " - " + objects[i]); // prints out each out each object and their corresponding command
        }
      }

      char examineObjectChar = input.next().charAt(0);
      int examineObject = errorTrapIntInputs(examineObjectChar); // accept input for the object to be explored

      while (examineObject < 0 || examineObject > 4) {
        System.out.println("You search far and wide but cannot find that object. Enter a number from 0 to 4.");
        examineObjectChar = input.next().charAt(0);
        examineObject = errorTrapIntInputs(examineObjectChar);
      }
      input.nextLine(); //prevents skipping input
      
      if (examineObject == 0) { // for each object that the user selects, replace that element in the array as null and call the corresponding method
        objects[0] = "";
        numGuesses = venusFlytrap(numGuesses);
      }

      if (examineObject == 1) {
        objects[1] = "";
        numGuesses = labyrinth(numGuesses);
      }

      if (examineObject == 2) {
        objects[2] = "";
        numGuesses = lionPuzzle(numGuesses);
      }

      if (examineObject == 3) {
        objects[3] = "";
        numGuesses = map(numGuesses);
      }

      if (examineObject == 4) {
        System.out.println(
            "\nYou look back at the door and find a message on it. To escape this room, you must correctly guess the secret word through a game of hangman. However, you only have "
                + numGuesses + " guesses. Would you like to proceed?"); // ask player if they would like to proceed
        String proceed = input.nextLine();

        if (proceed.equalsIgnoreCase("yes")) { // if player says false stop the loop
          keepExploring = false;
        }
      } // otherwise, the loop will keep running and the player will be prompted to  explore another object
    }

    return runHangman(possibleKeywords, numGuesses); // run the hangman method
  }

  public static int candyRoom() {
    Scanner input = new Scanner(System.in);
    String[] possibleKeywords = { "confectionary", "peanut brittle", "gingerbread house", "butterscotch", "lemon sorbet", "decadence" }; // Array of possible guessing words for the hangman
    int numGuesses = 3; 

    System.out.println(
        "You tug at the knob of the candy door, but nothing happens. Out of nowhere, a large peppermint candy cane crashes down in front of you and hooks around your torso, whisking you into the room. The door slams shut, and you turn around only to spot a hangman puzzle engraved onto the door, with no clues or hints or anything. You're trapped!\nShaking, you look around, and see endless rows of chocolate rivers and candycane trees. However, there are a few objects scattered around the room, and each seem to sparkle, luring you in. You take a deep breath and prepare to explore."); // Gives  user  information
        System.out.println("\nGOAL: Examine all the items in the room. Every puzzle you solve will grant you another guess at the secret word holding you in.");
    System.out.println("READY? GO!");

    String[] objects = { "Candy Wrapper", "Candy Vendor", "Pond of Fudge", "Pile of Candy", "Locked Door" }; // Array of objects that the  player may explore
    boolean keepExploring = true; // initialize a boolean to determine if the code will keep prompting the user to explore another object

    while (keepExploring) { // will iterate as long as keepExploring is true
      System.out.println("\nWhich item would you like to examine?");

      for (int i = 0; i < objects.length; i++) {
        if (!objects[i].equals("")) {
          System.out.println(i + " - " + objects[i]); // prints out each out each object and their corresponding command
        }
      }

      char examineObjectChar = input.next().charAt(0);
      int examineObject = errorTrapIntInputs(examineObjectChar); // accept input for the object to be explored

      while (examineObject < 0 || examineObject > 4) {
        System.out.println("You search far and wide but cannot find that object. Enter a number from 0 to 4.");
        examineObjectChar = input.next().charAt(0);
        examineObject = errorTrapIntInputs(examineObjectChar);
      }
      input.nextLine(); //prevents skipping input

      if (examineObject == 0) { // for each object that the user selects, replace that element in the array as null and call the corresponding method
        objects[0] = "";
        numGuesses = candyWrapper(numGuesses);
      }

      if (examineObject == 1) {
        objects[1] = "";
        numGuesses = candyVendor(numGuesses);
      }

      if (examineObject == 2) {
        objects[2] = "";
        numGuesses = pondOfFudge(numGuesses);
      }

      if (examineObject == 3) {
        objects[3] = "";
        numGuesses = candyPile(numGuesses);
      }

      if (examineObject == 4) {
        System.out.println(
            "You look back at the door and find a message on it. To escape this room, you must correctly guess the secret word through a game of hangman. However, you only have "
                + numGuesses + " guesses. Would you like to proceed?"); // ask player if they would like to proceed
        String proceed = input.nextLine();

        if (proceed.equalsIgnoreCase("yes")) { // if player says false stop the loop
          keepExploring = false;
        }
      } // otherwise, the loop will keep running and the player will be prompted to
        // explore another object
    }

    return runHangman(possibleKeywords, numGuesses); // run the hangman method
  }

  public static int spaceRoom() {
    Scanner input = new Scanner(System.in);
    String[] possibleKeywords = { "horoscope", "constellation", "aurora borealis", "betelgeuse", "equinox", "solar eclipse" }; // Array of possible guessing words for the hangman
    int numGuesses = 3;

    System.out.println(
        "You reach for the space door knob, and hear a faint whooshing noise coming from the other side. Suddenly, a light appears, blinding you and forcing you to cover your eyes in surprise. When you open them, you are in a dark black room covered with star patterns that resembles outer space. \nAs you admire the stars, the door behind you suddenly slams shut and you start up in fear. Nevertheless, as you look around, you see a few objects that may be worth investigating. \nYou brace yourself and prepare to work.");
    System.out.println("\nGOAL: Examine all the items in the room. Every puzzle you solve will grant you another guess at the secret word holding you in.");
    System.out.println("READY? GO!");

    String[] objects = { "Black Hole", "Star Alignment", "Spaceship", "Moon", "Locked Door" }; // Gives user array of items to examine
    boolean keepExploring = true; // While keep exploring is true, will continue running the loop

    while (keepExploring) {
      System.out.println("\nWhich item would you like to examine?");

      for (int i = 0; i < objects.length; i++) {
        if (!objects[i].equals("")) {
          System.out.println(i + " - " + objects[i]); // Prints the array of options
        }
      }

      char examineObjectChar = input.next().charAt(0);
      int examineObject = errorTrapIntInputs(examineObjectChar); // accept input for the object to be explored

      while (examineObject < 0 || examineObject > 4) {
        System.out.println("You search far and wide but cannot find that object. Enter a number from 0 to 4.");
        examineObjectChar = input.next().charAt(0);
        examineObject = errorTrapIntInputs(examineObjectChar);
      }
      input.nextLine(); //prevents skipping input

      if (examineObject == 0) { // for each object that the user selects, replace that element in the array as null and call the corresponding method
        objects[0] = "";
        numGuesses = blackHole(numGuesses);
      }

      if (examineObject == 1) {
        objects[1] = "";
        numGuesses = starAlignment(numGuesses);
      }

      if (examineObject == 2) {
        objects[2] = "";
        numGuesses = spaceship(numGuesses);
      }

      if (examineObject == 3) {
        objects[3] = "";
        numGuesses = moonPhase(numGuesses);
      }

      if (examineObject == 4) {
        System.out.println(
            "You look back at the door and find a message on it. To escape this room, you must correctly guess the secret word through a game of hangman. However, you only have "
                + numGuesses + " guesses. Would you like to proceed?");
        String proceed = input.nextLine();

        if (proceed.equalsIgnoreCase("yes")) {
          keepExploring = false; // Stops loop
        }
      }
    }

    return runHangman(possibleKeywords, numGuesses); // Calls hangman method
  }

  public static int runHangman(String[] wordList, int numOfGuesses) { // runs the hangman program
    Scanner userInput = new Scanner(System.in);

    int score = 0; // initialize variables
    int numLives = numOfGuesses;
    boolean keepGuessing = true;
    boolean guessedAlready = false;
    boolean rightGuess = false; 
    String wrongGuesses = "";

    int randomIndex = (int) (Math.random() * wordList.length); // generate a random index from the array of possible words
    String answer = wordList[randomIndex]; // set the answer as the word of this index
    String display = ""; // initialize the string that the player will see

    for (int i = 0; i < answer.length(); i++) { // iterate for every character
      if (answer.substring(i, i + 1).equals(" ")) { // if the character is a space, add a space
        display += " ";
      } else {
        display += "_"; // otherwise, add an underscore
      }
    }

    // System.out.println(answer); //for debugging purposes

    while (keepGuessing) {
      guessedAlready = false; 
      rightGuess = false;
      System.out.print("\nLives left: "); // displays the number of lives the player has
      for (int i = 0; i < numLives; i++) {
        System.out.print("♡ ");
      }

      System.out.print("\nWrong guesses: ");
      for (int i = 0; i < wrongGuesses.length(); i++) {
        System.out.print(wrongGuesses.charAt(i) + " "); // displays the guesses that the user entered wrong
      }

      System.out.println("\n" + display);

      System.out.println("\nEnter your guess:");
      String guess = userInput.nextLine();

      for (int i = 0; i < wrongGuesses.length(); i++) { //check if the letter has been guessed already
        if (guess.equalsIgnoreCase(wrongGuesses.substring(i, i+1))) {
          guessedAlready = true; 
        }
      }

      if (guessedAlready) {
        System.out.println("\nYou have already guessed this letter.");
      } else {      
        if (guess.length() == 1) { // Hangman game, if a user's guess is correct then it replaces the character in that place with the correct character
          for (int i = 0; i < answer.length(); i++) {
            if (guess.equalsIgnoreCase(answer.substring(i, i + 1))) {
              display = display.substring(0, i) + answer.substring(i, i + 1) + display.substring(i + 1);
              rightGuess = true;
            }
          }
          if (rightGuess == false) { // if a user's guess is wrong, it removes a life
            wrongGuesses += guess;
            numLives--;
          }
        } else {
          if (guess.equalsIgnoreCase(answer)) { // if the guess is the correct word, lets them escape and stops the loop
            System.out.println("Congratulations, your guess is correct! With a final battle cry, you tug on the door knob, and it swings right open! All of your emotions spill out of you and you grin pridefully, stepping outside and breathing in the fresh air. YOU ESCAPED!");
            keepGuessing = false;
          } else { // if the user's guess is wrong, removes a life
            System.out.println(guess + " is not the right word.");
            numLives--;
          }
        }
    
        if (numLives == 0) { // if user runs out of lives, stop loop
          System.out.println("Oh no! You have run out of lives. Desperate, you tug on the door knob, but to no avail; it doesn't budge one bit. As you continue tugging, the door frame begins fading away, slowly by slowly etching into just a faint outline. You are now trapped in this room forever. YOU FAILED!");
          keepGuessing = false;
        }
  
        if (display.equals(answer)) { // if user's answer is correct, stop loop
          System.out.println("Congratulations, your guess is correct! With a final battle cry, you tug on the door knob, and it swings right open! All of your emotions spill out of you and you grin pridefully, stepping outside and breathing in the fresh air. YOU ESCAPED!");
          keepGuessing = false;
        }
      }
    }
    
    System.out.println("The right word was " + answer + ".");

    System.out.println("");
    System.out.println("     ^?JJJJJJJJJJJJJJJ?:   7JJJJJJJJJJJJJJJJJ7    :?JJJJJJJJJJJJJJJJ!    !JJJJJJJJJJJJJJJJ?.              .7JJJJJJJJJJJJJJJJ! :JJJJJ^        .JJJJ:   .7JJJJJJJJJJJJJJJJ!   .7JJJJJJJJJJJJJJJJJ7        ");
    System.out.println("    7@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@J  ^@@@@@@@@@@@@@@@@@@@~  #@@@@@@@@@@@@@@@@@@B             .@@@@@@@@@@@@@@@@@@@? !@@@@@7       Y@@@@@  :@@@@@@@@@@@@@@@@@@@7 .@@@@@@@@@@@@@@@@@@@B        ");
    System.out.println("    &@@@@@@@@@@@@@@@@@@@   P@@@@@@@@@@@@@@@@@@!  P@@@@@@@@@@@@@@@@@@@: ^@@@@@@@@@@@@@@@@@@@P             5@@@@@@@@@@@@@@@@@@@!  &@@@@#       #@@@@&  5@@@@@@@@@@@@@@@@@@@~ ?@@@@@@@@@@@@@@@@@@&:        ");
    System.out.println("   :@@@@@G:::::::~@@@@@B   .~JJJJJJJJJJ?#@@@@@.  &@@@@&~@@@@@&^#@@@@&  5@@@@@5?JJJJJ?G@@@@@~             &@@@@&^:::::::B@@@@@.  5@@@@@.     .@@@@@5  &@@@@@J?JJJJJ?&@@@@@  #@@@@@~::::::::::^.          ");
    System.out.println("   ?@@@@@:       :@@@@@?  G@@@@@@@@@@@@@@@@@@#  :@@@@@7.@@@@@? @@@@@G  &@@@@@@@@@@@@@@@@@@@             .@@@@@J        &@@@@#   ^@@@@@7     7@@@@@^ :@@@@@@@@@@@@@@@@@@@B .@@@@@5                       ");
    System.out.println("   B@@@@&        J@@@@@. !@@@@@@@@@@@@@@@@@@@J  J@@@@@.?@@@@@.^@@@@@! :@@@@@@@@@@@@@@@@@@@P             7@@@@@:       :@@@@@?    @@@@@G     G@@@@@  ?@@@@@@@@@@@@@@@@@@@~ !@@@@@~                       ");
    System.out.println("  .@@@@@P        #@@@@&  G@@@@@GGGGGGGP&@@@@@:  #@@@@& #@@@@& 5@@@@@. ?@@@@@BPGGGGGGGGGPY!              B@@@@&        J@@@@@:    B@@@@@     @@@@@B  #@@@@@GGGGGGGGGGGPJ^  P@@@@@                        ");
    System.out.println("  ~@@@@@&#######&@@@@@5  @@@@@@#B#####B@@@@@&  .@@@@@5 @@@@@5 &@@@@#  B@@@@@#B#########BY              .@@@@@@########@@@@@&     7@@@@@&###&@@@@@7 .@@@@@@###########B!   &@@@@B                 JB##&^ ");
    System.out.println("  5@@@@@@@@@@@@@@@@@@@^ :@@@@@@@@@@@@@@@@@@@P  7@@@@@:!@@@@@^.@@@@@?  @@@@@@@@@@@@@@@@@@@7             ^@@@@@@@@@@@@@@@@@@@Y     .@@@@@@@@@@@@@@@. ^@@@@@@@@@@@@@@@@@@@. ^@@@@@7                Y@@@@@. ");
    System.out.println("  ~&&&&&&&&&&&&&@@@@@@  .#@&&&&&&&&&&&&&&&&G  !&@&&&? Y@&&&J 7@&&&P   P@&&&&&&&&&&&&&&&&@7             .#@&&&&&&&&&&&&&&&&G       !&&&&&&&&&&&&&!  .#@&&&&&&&&&&&&&&&@&.^#@&&&5                 B@&&&!  ");
    System.out.println("     ......... :@@@@@B                                                                                                                                                                                  ");
    System.out.println("  J#&&@@@@@@@@&@@@@@@7                                                                                                                                                                                  ");
    System.out.println(" Y@@@@@@@@@@@@@@@@@@@.                                                                                                                                                                                  ");
    System.out.println(" #&&&&&&&&&&&&&&&&&B~                                                                                                                                                                                   ");
    
    score = numLives * 100;
    
    return score; // returns that player's score
  }

  //sorts the new score with the previous top 6 scores and returns an updated version of the leaderboard
  public static String[] getLeaderboard(String name, double myScore, String[] myHighScores){
    int firstDigit = (int) myScore / 100; //extract the first digit of the score and cast as int
    int firstDigitAscii = firstDigit + 48; //convert the integer to its corresponding ascii value 
    for (int i = 0; i < myHighScores.length; i++){
      if (firstDigitAscii >= ((int)(myHighScores[i].charAt(0)))){ //check if the first digit of the score is greater than that of each element in the high scores array using ascii values
        for (int j = 5; j > i; j--){
          myHighScores[j] = myHighScores[j-1]; //shift every element starting from the index i back one position in the array
        }
        myHighScores[i] = ((char)firstDigitAscii) + "00.0-------" + name; //replace the old score with the new one and the name of the scorer
        break;
      }
    }
    return myHighScores; 
  }
  
  public static int venusFlytrap(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "\nYou're looking around when you spot a small little venus flytrap that looks a bit hungry, perched on a rock. You, being brash and overconfident, stick your finger out to pet it, and -WHAM!- nearly avoid getting bitten. You quickly retract your hand and notice notice a few food items lying scattered around the flytrap. The items are...\n\n1. A piece of banana\n2. A small dead fly\n3. A large dead fly\n4. A small dead bird");

    System.out.println("                                   .                                                                ");
    System.out.println("                                   ~7                      .                                        ");
    System.out.println("                                    G7                     Y.         ..                            ");
    System.out.println("                                    ~5!        ~          .B:         Y^                            ");
    System.out.println("                                     J?7       JY         !5~        ^B:                            ");
    System.out.println("                            ~^       ~?77      ~Y?        J7?       .JY.                            ");
    System.out.println("                            .G~       J~7?     :J!?      ^?~Y       ?!Y.         ^^                 ");
    System.out.println("               .             ^P!      ~?^7?    .Y^7?     J~^Y.     !?^Y.       :YJ                  ");
    System.out.println("               :Y~            7J?      Y~^!?.   J~^77   ^J^^7!    ^J^~Y.     :7JJ                   ");
    System.out.println("                .JY!.         .J!?.    !?^^~?.  J!~~?7 .Y7!!!5:  ^J~~^Y.   :77!J.                   ");
    System.out.println("                  ^J?7^        !?~J:   .Y~!!?5!~YYJYY5JYYJ!!!77!!?????5^ :77~~Y.         .^7:       ");
    System.out.println("                   .!?!7~.      J~~J!:^~YYYYJJ??77!!!!!!!!!!7!77!!!~~~~!7YJ7~?^       :~7JJ:        ");
    System.out.println("                     :?!~77^    ?Y???!~~~!!~!!77?JJY5555PPPPPPPPPPP55YJ?!^~7YJ    .^!77??:          ");
    System.out.println("                       !?~~7Y?!777???!!7?J555PP5555555555Y5YYYYYYYY55555P5?~~7!^~77!~77:            ");
    System.out.println("         ^7!^:.         :JJ?77????JY55P55555YYYYYYYY555Y5YBBYY5Y55555YYYY5PP?^!57^~!?^              ");
    System.out.println("           :!?J7!!!~~^::!7!^~?Y555GB55YYYYY555YY55555YY5YJPBPYY5YJY5Y5P555Y5P5~!Y?7^                ");
    System.out.println("              .^77!~~!5J~^~J5P55YYP#PY55YY55YYBPY5555YY5J?YYYPY5J??YYP&5Y555YPGG!5:        ..       ");
    System.out.println("                 .~7?Y!^~YPP5YYY5Y5PPPY555YYY5BB5Y5YYPGYJ?JP~YPJ???JYG5PJ55YYPYY7~J^^^~~!?J7.       ");
    System.out.println("                   :5~^!PP5Y55Y5Y55G7G5Y5555YYP?GYJYYGPPJ?JP~~Y5????JP~PJY55GY^J5^YJ~!77!:          ");
    System.out.println("       .:::..      J!^!G5Y5Y5#PYYYYG77GJJY55YY5^5Y?YYG77PJ?P!^~?5J??5?^J5J5GJ~!?#!757!:             ");
    System.out.println("        .~7???7!!!5?^^Y#YY55YBB5Y5YP5^JP??JYJ5Y^!P5YJG7^7PJP7^~~7PPPP7?J5JYJ7777J?5J                ");
    System.out.println("            .:?7!!5~~^P&B5Y5YP5PPYY5G~^Y5????P?^^7PJJG!~!?GGJ???77?7!!~~^~^^^^^^^^~J.               ");
    System.out.println("              .J7!5~~~GGPP5YY5P!GY?5G!^^J5??YP!!!7YP55?77!!~~~~~^^^^^~~~~~~^~^^~~~^77               ");
    System.out.println("               .YJ5~^~GPP7G5Y5G!!5YJG?~!!YPY5Y??7!~~~~!!777???7~~~~~~~~~~~!!777?!~~77               ");
    System.out.println("      .^~~^^^^^^~PYJ7~P5G!~PPYG?!?PY5J??????7??!!!7????7!!~~~~~~~~~~~~????77!!77??!Y.               ");
    System.out.println("       .:~!77777!!JY7?GGGY7?5JJ????????77!!7????7!!~~~^^~~~~~~~~~~~~~~~~~!!7??77~~?~                ");
    System.out.println("              ..:^~PP?5Y7!!7??777!!~~~~^^^^~~~~^^^~~~~~~~~~~~~~~~~~~!????7!!~~^^!?^                 ");
    System.out.println("                   .P?~^7J?7~~~^^~~~~~~~~~~^^^~~~~~~~~~~~~~~~~~~~~^~~~~~^^^^~~!7!.                  ");
    System.out.println("                   :J^~JJ~^^~~~~~~~~~~~~~~~!7!~~~~~~~~~~~~~~~^~~~!!~~^^~~~!77!^.                    ");
    System.out.println("                    ?!~?~~~~~~~~~~~~~7?????77!~~~~~~~^^^~~~!77???77~!!!7!~^.                        ");
    System.out.println("                     7?~^~~~~~~~~~~~~!~~~~^^^^^~~~~~!!77???777!!!!!~^:.                             ");
    System.out.println("                      :77!~~~^~^~~~~~~^~~^^~^!7???J?????7!!~~^:.                                    ");
    System.out.println("                        .:~!77!!!!!!!!!!!!!!!7?7!!~~57!?J                                           ");
    System.out.println("                        .:~!77!!!!!!!!!!!!!!!7?7!!~~57!?J                                           ");
    System.out.println("                             ...::^^:::::....       ?!^^J.                                          ");
    System.out.println("                                                    ^J^^7!                                          ");
    System.out.println("                                                     J~!~J                                          ");
    System.out.println("                                                     J!5!Y.                                         ");
    System.out.println("                                                     7!???~                                         ");
    System.out.println("                                                     ~?!Y!?                                         ");
    System.out.println("                                                     ^?~5~J                                         ");
    System.out.println("                                               :~!!!!JJ^5!Y!~!!!!!^                                 ");
    System.out.println("                                             .77~~~~!JY^Y!YJ!!~~~~!J:                               ");
    System.out.println("                                            .J~^~~~7?YY^J7J57?!~~~~~J.                              ");
    System.out.println("                                            J~^~~~~??YY^J7?57?7~~~~^!?                              ");
    System.out.println("                                           !7^~~~~~JPYY^Y7?57?7?~~~~~Y                              ");
    System.out.println("         .                                 J~~~~~~~JGYY^Y!J57?75~~~~~J.                             ");
    System.out.println("       .P^                                .Y~~~~~~~JG5J^~^J57775~~~~^Y.                             ");
    System.out.println("      .J5~                                .J~~~~~~~JG5?^~^YY77?Y^~~~~Y.                             ");
    System.out.println("     .Y7??                                 J~~~~~~~JPP7^?75J7!JJ^~~~!?                              ");
    System.out.println("    .Y7!!Y.                                ?!~~~J~~55P~~5!P??!!~?7^^?~                    !?        ");
    System.out.println("   .Y7!!!??                                J~~~~5!~?J5^7Y!P??~^~5!^~Y                     Y5.       ");
    System.out.println("   Y?!!!!!J!                               J~~~~5!~75J^5!?577~^?J^^J^                    7??J       ");
    System.out.println("  7J!!77!!!J!                             .J~~~~5~~?P!!5^5J?!^~5~^7!                    !J!!Y:      ");
    System.out.println(" :Y!7!JP!!!!J7                            :J^~^!5~!Y5^Y7!P?7~^Y?^7?                    7J!!!??      ");
    System.out.println(" ??!!!?G7!!!!?J^                          !7~~^?7~?P!!5^JY?7^?Y^!J                   :J?!!7J!5.     ");
    System.out.println(".5!!!!7PY!!!!!!J?:                        J!^~~~~75J^Y7~P?P!!Y~!J                  .7J7!!!?P!Y~     ");
    System.out.println(":Y!!!!!YG7!!?7!!7J?^.                    .Y~~~~~!YY^!5^YY5J!5~!J.                .!J7!!!75Y5!??     ");
    System.out.println("~Y!!7!!7P57!?5?!!!7?J7^.                 ~J^~~~!Y5~~5!!PJP!J~!J.              .^?J7!!!!!PY5Y!7J     ");
    System.out.println(":5!!?5!7?GY7!7YY7!!!!7???~:              ?!~~~~Y5~^JJ^5J5?^^!?            .:~???7!!!!!!5P!P?!7J     ");
    System.out.println(".Y7!!Y5!7JP57!!?5J7!!!!!77??7^.         .J~~~~Y5~^7Y^J577~^7?       ..:~7???7!!!!!!!!75P7?P!!??     ");
    System.out.println(" !J!!!J577?5P?!!7J5J7!!!!!!!7??7:       ~?^~~J5~^75~!P?!^^7!   .^!7????77?J!!!!!!!!!75P7!5J!!Y~     ");
    System.out.println("  Y7!!!?5?!7YP5?7!7J5J7!!!!!!!!7J?:     J!~~J5?7~5!^5Y7~^7!.:!???77!!!!?YY?!!!!!!!7JPY7!7Y!!75      ");
    System.out.println("  .Y?!!!75Y77?YP5J7!7JYY?7!!!!!!!7J?:  :J~~J5!5~Y7^?57~^JY7??7!!!!!!7?YY?!!!!!!!7J5P?7!!!!!!Y~      ");
    System.out.println("   .?J!!!!J5J777J5P5J7!7JYY7!!!!!!!7J! 77^?5~Y!JJ^!P?!!Y5?7!!!!!!!?JYJ7!!!!!!7?YP5J7!!!!!!!J7       ");
    System.out.println("     ~J7!!!7J5J777?J5P5J7!?YY?!!!!!!!?Y5^?P~?J75~^5YJYJ7!!!!!!7?JYY?!!!!!7?J555J77!!!!!!!!J7        ");
    System.out.println("      .7J7!!!7?7!!777?J5PY?!7Y57!!!!!!75YP!~5!5!^?P5Y7!!!!!7JYYJ7!!!7?JY555Y?7!!!!!!!!!!?J^         ");
    System.out.println("        .7J7!!!!!!!!!77??YP5J7?5Y7!!!!!!PJ^Y??7^~BP?!!!!7JYJ?7!!7?Y555YJ?7!!!!!!!!!!!!7J!.          ");
    System.out.println("          .!J?7!!!!!!!!!77?J5PJ7J5?!!!!!7577~~^~55!!!!7YY?7!7?J555YJJJYJJ7!!!!!!!!!7?J!.            ");
    System.out.println("             ~??7!!!!!!!!!77?JP5J?J!!!!!!?P~~~~YJ!!!7YY?!7?Y555YJYYYJ?7!!!!!!!!!7??7^               ");
    System.out.println("               :!??7!!!!!!!!77?JP5?7!!!!!!YJ^~YJ!!!7Y?77J5P5J7?YJ77!!!!!!!!!77??7^                  ");
    System.out.println("                  ^7??7!!!!!!!7??5PJ77!!!!7P~JY!!!!!77YP5J?7!!!!!!!!!!!!77??7~:                     ");
    System.out.println("                    .^7?77!!!!!!7?JP5?7!!!!5J5!!!!7?YP5J7!!!!!!!!!!777??7~:                         ");
    System.out.println("                       .^7J77!!!!7??5P?7!!!Y#7!!77YP5?7!!!!!!!!77???!^.                             ");
    System.out.println("                          .~7?7!!!!7?5P?77!YG!77JPP?7!!!!!777?7!~:.                                 ");
    System.out.println("                         .^~!?5YJ7!!?YP5JJJ55?JYPY7!!!7??77?7~:                                     ");
    System.out.println("                       :YY??77!!755JJ7!~~~~~!7YGY77?YYYYJ~77!!77~.                                  ");
    System.out.println("                  .~!7777!!!!7?JJ?!~~~~~~~~~~~~~?YYYJ???JPJ!77!~!?!.                                ");
    System.out.println("        :^:::^::~77!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~7Y!.^5???YJ!!!~.                           ");
    System.out.println("      ^~:     .~Y!!~~~~~~~??!~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~777!!~~~~~~~!77~^::^:....                ");
    System.out.println("    .~.        :5!^~7!~~~?J.Y~~~~~~~~~~~~~~~!?!~~77!~~7777~~~~~~~~~~~!7!?Y:    ....~!               ");
    System.out.println("    ~^.   .::^JJ:...^577!??!?~~~~~~~~~~~~~~77.    .~77Y:.??~~~~!!!!!??  ^Y~^!7....^^.               ");
    System.out.println("      ::::.   ::.....  .:^~!!!!!!!!!!!!!!!7Y  ...   .Y???J7!!!~~~^::^~.  .:^:.....                  ");
    System.out.println("                                           ~^^:..^^:^.                .:::.                         ");
    System.out.println("");
    
    System.out.println("\nYou look back at the flytrap and its jaws are hinged open, as if it expects you to feed it. You look back at the four food items and wonder which one you should pick up...\n\nTASK: FEED THE FLYTRAP WITH THE CORRECT FOOD ITEM. ENTER A NUMBER FROM 1 TO 4 TO INDICATE WHICH ITEM YOU CHOOSE.");
    System.out.println("\nEnter \"Stop\" if you'd like to give up."); // gives user an option to give up

    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("Stop")) { // While the user's answer is not "stop", keep looping

      System.out.print("\nMy guess is: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equals("2")) // Correct guess
      {
        a++; // Add and extra guess
        System.out.println("\nCorrect! You get an extra life!");
        break; // Stop loop
      }

      if (!puzzleGuess.equals("2") && !puzzleGuess.equalsIgnoreCase("Stop")) // Wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
      {
        System.out.println("\nYou gave up and decide to go back and examine a different item");
      }
    }
    return a; // Return guess
  }

  public static int labyrinth(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println("As you roam around the jungle room, you look desperately around at the walls, but it is all towering stone and lush plant. However, at one of the corners of the room, you spot a small crevice. You eagerly trudge over to investigate, only to realize that the crevice leads to a dark tunnel. Nevertheless, you feel the need to explore, and you dive enthusiastically into the crevice! As soon as you reach the inside, you realize that this is simply the entrance to a labyrinth. As you turn back, you see the entrance that you just had just jumped through fade away, leaving only a wall in its wake. You turn to look at the labyrinth, and spot a clue on the walls: It is the image of the labyrinth in bird's-eye view, and you realize that this labyrinth is simply a maze. Around the maze, letters are scattered.\nTASK: FIND THE WORD THAT WILL ALLOW YOU TO GET TO THE END OF THE MAZE (INPUT THE WORD)");
    
    System.out.println("                 @@.                                                                                                                                                                                    ");
    System.out.println("                 @@.                                                                                                                                                                                    ");
    System.out.println("                 @@.                                                                                                                                                                                    ");
    System.out.println("              BG^@@^P#.                                                                                                                                                                                 ");
    System.out.println("              ~&@@@@@!                                                                                                                                                                                  ");
    System.out.println("                J@@P                                                                                                                                                                                    ");
    System.out.println("                 ..                                                                                                                                                                                     ");
    System.out.println("                         ......................................................................................................................................................................         ");
    System.out.println("        ^B               !??????????????7G&????????????????????????777777??????????????????????????????????????????????????????????????????????????7????????????????????????7P&?7?????????????&!        ");
    System.out.println("        ~#        .:                     7&                                                                                                                                  !&               &7        ");
    System.out.println("        ~#        G@:                    7&                                                                                                                                  !&               &7        ");
    System.out.println("        ^B        G@:                    7&                                                                                                                                  !&               &7        ");
    System.out.println("        ^B        G@:                    7&                                                                                                                                  !&               &7        ");
    System.out.println("        ~#    Y&5P@B                     7&                                                                                                                                  !&               &7        ");
    System.out.println("        ~#     .^^.                      7&                                                                                                                                  !&               &7        ");
    System.out.println("        ~#               ^.              7&               ^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~.              .^               ^~~~~~~~~~~~~~~~~^               ^.              !&               &7        ");
    System.out.println("        ~#               &!              7&               :^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^~@!              7&               &5^^^^^^^^^^^^^^5&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&                                                &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&                                            ..  &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&                                        &Y YB^  &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&                                        @&@G    &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&                                        @BJ&J   &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&                                        5~ .5?  &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              !&J?JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ???J???JJ&~              7&               &!              !&               &!              ~#               &7        ");
    System.out.println("        ~#               &~                ................................................                7&               &!              !&               &!                               &7        ");
    System.out.println("        ~#               &~                                                                                7&               &!              !&               &!                               #7        ");
    System.out.println("        ~#               &~                                                                                7&      7:       &!              !&               &!                               #7        ");
    System.out.println("        ~#               &~                                                                                7&     .@5       &!              !&               &!                               &7        ");
    System.out.println("        ~#               &~                                                                                7&     .@Y       &!              !&               &!                               &7        ");
    System.out.println("        ~#               &~                                                                                7&     .@G.::    &!              !&               &!                               &7        ");
    System.out.println("        ~#               &!                                                                                7&      JJJJJ.   &!              !&               &7                               &7        ");
    System.out.println("        ~#               PPYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY.              7&               &!              !&               PPYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY@7        ");
    System.out.println("        ~#                                                                                                 7&               &!              !&                                                &7        ");
    System.out.println("        ~#            7PY5Y                                                                                7&               &!              !&       :5   !J                                  &7        ");
    System.out.println("        ~#            @#!~^                                                                                7&               &!              !&       7@.  G&                                  &7        ");
    System.out.println("        ~#            :~75@?                                                                               7&               &!              !&       7@.  G&                                  &7        ");
    System.out.println("        ~#            GP?5&7                                                                               7&               &!              !&       .BGJ5&7                                  &7        ");
    System.out.println("        ~#              ..                                                                                 7&               &!              !&          ..                                    &7        ");
    System.out.println("        ~&.................................................................................................J&               &7              7@................................                &7        ");
    System.out.println("        ~&?????????????????????????????????????????????????????????????????????????????????????????????????B&               ?:              .Y???????????????????????????????G#               &7        ");
    System.out.println("        ~#                                                                                                 !&                                                                !&               &7        ");
    System.out.println("        ~#                                                                                                 7&                                                                !&               &7        ");
    System.out.println("        ~#    :JYYJ~                                                                                       7&                                                                !&               &7        ");
    System.out.println("        ~#   J@J:.!J                                                                                       7&                                                                !&               &7        ");
    System.out.println("        ~#   &&  Y5B~                                                                                      7&                                                                !&               &7        ");
    System.out.println("        ~#   Y@J:^5@Y                                                                                      7&                                                                !&               &7        ");
    System.out.println("        ~#    :JY?^?:    ^.              .~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~.              7@~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^P&               &7        ");
    System.out.println("        ~#               &!              .~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~@!              .~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^^^^~~~~~~~~~~~~~~~~~~~~~~~~~~~~:               &7        ");
    System.out.println("        ~#               &~                                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~                                                                &!                                           .#G. .#:                                              &7        ");
    System.out.println("        ~#               &~                                                                &!                                           ^@#&~.@~                                              &7        ");
    System.out.println("        ~#               &~                                                                &!                                           ^@^^&B@~                                              &7        ");
    System.out.println("        ~#               &~                                                                &!                                           :&: .B@^                                              &7        ");
    System.out.println("        ~#               &~                                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              :YJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ?J@G?JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ?JJJJ?JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ!               &7        ");
    System.out.println("        ~#               &~              ?@................................................&?..................................................................................               &7        ");
    System.out.println("        ~#               &~              7&                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              7&                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              7&                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              7&                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              7&                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              7&                                                &!                                                                                                 &7        ");
    System.out.println("        ~#               &~              7&               GPYYYYYYYYYYYYYYGP               &BJYYYYYYYYYYYYYYYYYYJJJYYYYYYYYYYYYYYYYYYYYYYYYYPBYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY@7        ");
    System.out.println("        ~#               &~              7&               &!              ?&               &!                                               7&                                                &7        ");
    System.out.println("        ~#               &~              7&               &~              7&               &!                                               !&                                                &7        ");
    System.out.println("        ~#               &~              7&               &~              7&               &!                                               !&                                                &7        ");
    System.out.println("        ~#               &~    B#~ .#:   7&               &~              7&               &!                                               !&                                                &7        ");
    System.out.println("        ~#               &~    @#&J.@~   7&               &~              7&               &!                                               !&                                                &7        ");
    System.out.println("        ~#               &~    @J B&@~   7&               &~              7&               &!     !~                                        !&                                                &7        ");
    System.out.println("        ~#               &~    P~  ?B:   7&               &~  ~@#  .&@.   7&               &!     &&        .................               !&                ................                &7        ");
    System.out.println("        ~#               &~              7&               &~  !@#P BB@:   7&               &!     &#       !&J?JJJJJJJJJJJ?J&~              !&               #G??????????????G#               &7        ");
    System.out.println("        ~#               &~              7&               &~  7@.&&G:@:   7&               &!     &&^^~.   7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&               &~  .7 .J  ?    7&               &!     ~7777.   7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&               &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&               &~              7&               &!              7&    ^PP#GPJ    &!              !#               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&               &~              7&               &!              7&      :@Y      &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &~              7&               &~              7&               &!              7&      .@J      &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               &5^~~~~~~~~~~~~^P&               &~              7&               &!              7&      .@J      &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               ^~~~~~~~~~~~~~~~~:               &~              7&               &!              7&       .       &!              !&               &!              !&               &7        ");
    System.out.println("        ~#                                                &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#                                                &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#                                                &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#                                                &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#                                                &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#                                                &~              7&               &!              7&               &!              !&               &!              !&               &7        ");
    System.out.println("        ~#               !???????????????????????????????J&~              7&               &~              !#               &!              !#               &!              !#               &7        ");
    System.out.println("        ~B               ..................................               7&                                                &!                               &!                    .5YYYY!    &7        ");
    System.out.println("        ^B                                                                7&                                                &!                               &!                    ^@G:^^.    &7        ");
    System.out.println("        ~#                                                                7&                                                &!                               &!                    ^@&555.    &7        ");
    System.out.println("        ~#                                                                7&                                                &!                               &!                    ^@P....    &7        ");
    System.out.println("        ~#                                                                7&                                                &!                               &!                    .GP55P?    &7        ");
    System.out.println("        ~#                                                                7&                                                &!                               &!                               &7        ");
    System.out.println("        ~#                                                                ?&                                                &7                               &7                               &7        ");
    System.out.println("        :BYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYJJJJYYYYYYYYYYYYYYYYYYYYYYYYYYG#YYYYYYYYYYYYYYYYYYYYYJJYYJYYYYYYYYYYYYYYYYYYYYYY#PYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY#PYYYYYYYYYYYYYYY?       .       P~        ");
    System.out.println("                                                                                                                                                                                     ^@B                ");
    System.out.println("                                                                                                                                                                                     ^@&                ");
    System.out.println("                                                                                                                                                                                     ^@#                ");
    System.out.println("                                                                                                                                                                                   ~ ^@# ::             ");
    System.out.println("                                                                                                                                                                                  :@@G@&B@P             ");
    System.out.println("                                                                                                                                                                                    5@@@&~              ");
    System.out.println("                                                                                                                                                                                     :P?                ");
    
    System.out.println("\nEnter \"Stop\" if you'd like to give up");
    
    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("Stop")) {//while the user's answer is not "stop", keep looping

      System.out.print("");
      

      System.out.print("\nWhat word does the path spell out? ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equalsIgnoreCase("Jungle")) //correct guess
      {
        a++; //add an extra guess
        System.out.println("\nCorrect! You get an extra life!");
        break; //stop loop
      }

      if (!puzzleGuess.equalsIgnoreCase("Jungle") && !puzzleGuess.equalsIgnoreCase("Stop")) //wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) //user gives up
      {
        System.out.println("\nYou gave up and decide to go back and examine a different item");
      }
    }
    return a; //return guess
  }

  public static int lionPuzzle(int lives) {
    Scanner userInput = new Scanner(System.in); //create a scanner object
    String sentence = "Wpmxliv mw pssomrk ex Tstgsvr. Tstgsvr mw pssomrk ex Pedmi. Wpmxliv mw e vitxmpi, Pedmi mw rsx, erh ai hsr’x orsa mj Tstgsvr mw e vitxmpi. Mw e vitxmpi pssomrk ex e rsr vitxmpi?";
    int key = 0; 
    
    System.out.println("While you walk, you admire the trees and scenery around you, when suddenly -boom!- a clearing appears! You walk over only to see a majestic lion, grooming itself with its tongue. As you cautiously approach, the lion gets startled by your mere presence and stands up, running away. You think to yourself that this is pretty weird, but then you notice that a stone tablet where the lion was perched earlier. Upon further inspection, you notice that this tablet contains a series of letters and symbols.");
    System.out.println("\nWpmxliv mw pssomrk ex Tstgsvr. Tstgsvr mw pssomrk ex Pedmi. Wpmxliv mw e vitxmpi, Pedmi mw rsx, erh ai hsr’x orsa mj Tstgsvr mw e vitxmpi. Mw e vitxmpi pssomrk ex e rsr vitxmpi?");
    System.out.println("\nYou also find a handbook containing several encryption keys. Each letter of the sentence appears to have been shifted several letters back in the alphabet. Perhaps finding the right shift value, will aid you in answering the question at hand.");

    while (key != 22) {
      System.out.println("Enter possible shift values to decrypt the encoded phrase:");
      System.out.println("\nEnter \"Stop\" if you want to give up."); //gives user an option to give up if they are unable to get the answer
  
      key = userInput.nextInt();
      userInput.nextLine(); 
  
      while (key < 1 || key > 25) { //keep asking for a valid key if one is not provided
        System.out.println("Please enter a number between 1 and 25");
        key = userInput.nextInt(); //accept user input 
        userInput.nextLine(); //prevent skipping
      }

      sentence = sentence.toLowerCase();
      
      String result = ""; //initialize result variable
  
      for (int i = 0; i < sentence.length(); i++){
        int dec = ((int) (sentence.charAt(i))); //find the DEC value of the character
        char encryptedLetter = sentence.charAt(i);
        if (dec >= 65 && dec < 97) //for capital letters
        {
          int newDec = dec + key; //find the DEC value of the encrypted character
          if (newDec > 96) //allows shifted letters to restart at the beginning of the alphabet if need be
          {
            newDec = 64 + newDec % 96;
          }
          encryptedLetter = ((char) (newDec)); //find the encrypted letter
        }
        if (dec >= 97 && dec < 123) //for lowercase letters
        {
          int newDec = dec + key; //find the DEC value of the encrypted character
          if (newDec > 122) //allows shifted letters to restart at the beginning of the alphabet if need be
          {
            newDec = 96 + newDec % 122;
          }
          encryptedLetter = ((char) (newDec)); //find the encrypted letter
        }
        result += encryptedLetter; //concatenate the new encrypted letter to the result
      }
      System.out.println(result); //print output
    }

    String answer = ""; 
    while (!answer.equalsIgnoreCase("stop")) {
      answer = userInput.nextLine();
      if (answer.equalsIgnoreCase("yes")) {
        System.out.println("\nCorrect! You get another life!");
        return lives+1;
      }else if (!answer.equalsIgnoreCase("stop")) {
        System.out.println("\nWrong answer. Try again.");
      }
    }
    return lives;
  }

  public static int map(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "You wander over to one corner of the room, and, through a bundle of vines and thickets, you spot a small beige thing on the ground. At closer inspection, you see that it is a detailed treasure map, marking a specific location that you feel an inexplicable urge to reach. You know that once you get there, you will be bestowed with some sort of great treasure. There's just one problem though; one of the location's names is scrambled. Your job is to decypher the missing location and figure out what the location is named. \nTASK: UNSCRAMBLE THE MISSING NAME ON THE MAP AND INPUT IT");
    
    System.out.println("\nEnter \"Stop\" if you want to give up."); // Gives user an option to give up if they are unable to get the answer

    System.out.println("                                                                                                                                       .^7?.            ..                                              ");
    System.out.println("                                                                                                                                  :~J55Y?!JG5^        .Y#^                                              ");
    System.out.println("                                                                                                                       ...::~!?Y55Y7~:......7BP.    ^5GP&^                                              ");
    System.out.println("                                                                         ..^!7JY5555YY?7~^:..      ...::^~~!7?JJYY555555YYJJ?!~^............ .GB..7GG7.!&^                                              ");
    System.out.println("                                                                      !PPP5Y?!~^:::::^~7?JY5555555555YYYJ?7!!~~^:::.......................... ^BYPJ^.  ?&:                                              ");
    System.out.println("                                                                      BP................ .....................................................:Y!..... Y&.       .                                      ");
    System.out.println("                                                       :!YPGPJ~.     .BJ ..............................................................................G#..:^!?YB5                                      ");
    System.out.println("                                                  .^75GPJ!:..^7P5~   ^#7...............................................................................GBP55J?~J&^                                      ");
    System.out.println("                                              .~YPG?!^...    :!Y#B^  ^&7...................................................:::::::::::.................:.......PB                                       ");
    System.out.println("                                         .:7YPPY7:.. .....   ..^J5J^ .B?................................................:::::::.::::.::.:.....................:#J                                       ");
    System.out.println("                                   .:~?YPP5?~:.................. .:755&J.............................................:::::::::~5GG555~.::::::..:::::::::::....^&!                                       ");
    System.out.println("                   ..::^~!!7?JY55PP5YJ!^:......................   ..:?BP.................................:::::::::::::::::::::^Y#&##BG7:.:::::::::::::::::::..^&!                                       ");
    System.out.println("                   ^G&BJ777!!~^::............................. .......:!..................:::::::::::::::::::::::::::::::::::::.^P#####G~.::::::..::::::::::..:#J                                       ");
    System.out.println("                     ^YG?:. ......................................................:::::::::::::::::::::::::::::::::::::::::::::..:7B#&&&#?::..:~?Y7:.::::::....5#.                                      ");
    System.out.println("                   ..:~P#BY^....................................................:::::::::::::::::::::::::::....:::::^^~~~^^::::::..^5&&#&&P~!YB#&&&BJ^:::::....:BG                                      ");
    System.out.println("                  J#J77~::....................................................:::::::::::::::::::::::::::^!J5PP57:^JPGB#BGPY!:::::::.!B&##&&&&&&&&&&&G:::::.....:BG.                                    ");
    System.out.println("                  .#? ........................................................:::::::::::::::::::::.:::^YPGPY?!^:::::::::::::::::..:~?G&#########GY7~:::::::......5#~                                   ");
    System.out.println("                   ^#~........................................................::::::::::::::::::::!5GY:::::..:::::::::::::::::::^75B#&&&&&&&##&Y:...:::::::::......7#Y                                  ");
    System.out.println("                    ?#:........................................................:::::::::::::::::^G&G!::::::::::::::::::::::::::P&&&&&#BPY!?#&##&5^.:::::::::::..... ^BG.                                ");
    System.out.println("                     5G........................................................:::::::::::::::::7J^:::::::::::::::::::::::::::^##BPJ!^::.:.^P&&#&#7:::::::::::::.... .G#.                               ");
    System.out.println("                      PP......................................................:::::::::::::::~GJ..:::::::::::::::::::::::::::::~^::::::::::::!B&&&&P:::::::::::::......BG                               ");
    System.out.println("                       G5....................................................:::::::::::::::!@#^:::::::::::::::::::::::::::::::::::::::::::::::J555J^:::::::::::::.... !&!                              ");
    System.out.println("                       .BY.................................................::::::::::::::::.7B^::::::::::::::::::::::::::::::::::::::::::::::::..:..::::::::::::::.....:#5                              ");
    System.out.println("                        .BY..........................:^~~!!~^:..      ...::::...............^^.:.............::::::.......::::::.....:::::::::::......::::::::::::......GG                              ");
    System.out.println("                         .GY.................:.....~7??7&##BBBBBBBGP5Y7^:::::PBBBBB########7G#:?BBBBB####B###P::::7BBBBBB7:::::^BBBBB^::::::::::5BBBBP^.:::::::.........BP                              ");
    System.out.println("                           PP...........^~77???J?77JJJ?J@@@@@@@@@&@@@@@@Y::::@@@@@@&&&&&&&&?JG.5@@@@@&&&&&&&&B:::.J@@@@@@@B~.::~@@@@@~:::::::.~#@@@@@@&!.:.............:#Y                              ");
    System.out.println("                            JB~........:^::~?JJ??JJYJ?JY@@@@@!^~~:^5@@@@@::::&@@@@P7?????7::.~!5@@@@&7??????~::::.J@@@@&B@@@P^.~@@@@@~::::::.?@@@@5Y@@@@J............. !&!                              ");
    System.out.println("                             ~BJ.........:7J?~7?J?7^7J!7@@@@@@@&@@@@@@@&J::::&@@@@@@@@@@@&^:.?&&@@@@@&&&&&@@J.:::.J@@@@&:7&@@@J~@@@@@~::::::G@@@@P^^Y@@@@G. ...........Y&:                              ");
    System.out.println("                              .5G^......^J7^:!???!^ .^JY@@@@@&#&##@@@@@G^::::&@@@@?:::::::::::~#@@@@&!!77777!!^::.J@@@@&:.:J&@@&@@@@@~:::.~&@@@@@@@@@@@@@@&~ ..........GB                               ");
    System.out.println("                                !BJ.....?^..~JJ?!......Y@@@@@Y7JYY5&@@@@#!^::&@@@@?.::::::::::.5@@@@@@@@@@@@@@P.:.J@@@@&:.:.:5@@@@@@@~:::J@@@@&JJ?????7B@@@@Y.........:#5                               ");
    System.out.println("                                 .PG:...^...?J77........5BG?JJ?7JYJ?GGPGP^:::7????^::::::::::::~?7??Y5Y7PBGPJ?~:::^!!!!~......^77???7^:::????7:.       .!!!!!.........:#J                               ");
    System.out.println("                                   J#!......??7?:........YY?!5Y7JJ::~YY~!?::::....::::::::::::::........^75GB5~....    ........ .....::::...............     .........:&J                               ");
    System.out.println("                                    ~#J.....!J??:........~555Y!J?::::75?.^::::::::::::::::::::::::::::::::::^^::57.....................................................#P                               ");
    System.out.println("                                     :#5.....7!??^........JY5^!5^..::75?:::::::::::....:::::::::::::::...::.....!&&:...................................................5#.                              ");
    System.out.println("                                      .GP......:~!:.....^:JPPYPY^^::~J!:....:..:~!777!!~:.:::::::.:^~!777!^:.  . :5^.^^^^:....^^^^^^^^^^^^^^:..........................^&Y                              ");
    System.out.println("                                        GG:............:@@@@@@@@@@@@@@BJ:....~B@@@@@@@@@@B7:::::!G&@@@@@@@@@&G!.. ^^5@@@@G.. Y@@@@@@@@@@@@@@Y ..........................Y&^                             ");
    System.out.println("                                         GB:...........:@@@@@Y7??YJB@@@@#...?@@@@@GJJG&&##B~:::5@@@@@P?7?5&@@@@G.~&?5@@@@G ..^?777#@@@@#77?57:...........................G#.                            ");
    System.out.println("                                          GB:..........!@@@@@5??J55#@@@@#...7@@@@@@@@@&&#G?:::~@@@@@~     :@@@@@P&#.5@@@@G ...    5@@@@G  ~:.^::^:.......................:BB.                           ");
    System.out.println("                                          .BB:.......:^~@@@@@@@@@@@@@@@5.....~?5PGGPP#@@@@@J..:@@@@@J.   .!@@@@@#?. P@@@@G ...... P@@@@G ^!.::::^J........................:BG.                          ");
    System.out.println("                                           .BG.......::~@@@@@7~!!!?&@@@@!...^&@@@@&GG&@@@@&:...~&@@@@&BBB&@@@@@?. . P@@@@G ...... P@@@@G ?^:::::.!:::......................:BG.                         ");
    System.out.println("                                            .#P........:#&&&&: ... ~&&&&P.....?G#&@@@&&#P!. ... .!P#&@@@@@@#P7. ....J&&&&Y....... J&&&&Y.J!?:::.^^~!~~......................:BB.                        ");
    System.out.println("                                             :#P............................:......::..:^!77!:.~YGBG57.:^:..  ..................:!~....~??!????:7Y??!?:......................:GB.                       ");
    System.out.println("                                              ^&5.....................::::::::::!?J?^:?PGGPY7:.::::............................~7^7!.:J?7!!!77!??!~!Y?J........................GB.                      ");
    System.out.println("                                               !&?.................::::::::.::YB#GJ~::::::..:::::.............................?5?775Y7!^^^^~!!!!!!!!~7??........................PB.                     ");
    System.out.println("                                                GB...............::::::::.^7~:~^::.::::::::::::::::..........................:J!!7!75!^^^^^^7J7!!!!!~!!J^:......................?&7                     ");
    System.out.println("                                                Y#:.............:::::::::Y&B^::::::::::::::::::::::.........................^J7!~!!!777~^^~7??J~^~~!!!!777J^..................!GP:                      ");
    System.out.println("                                                BG............:::::::::.?&Y::::::::::::::::::::::::.........................J7!!~!!!!!!J!??7~^!!~!!!!!!!!!7Y.............. .!GG!                        ");
    System.out.println("                                               ?&!............::::::::::!~.::::::::::...::::::::::.........................!?!!!!~!!!!!7Y5~^^^~Y?!!!!!!!!!!J7 ...........:?GP~                          ");
    System.out.println("                                              .#5.............:::::::::~#7.:::::::..........:::...........................~?!!!!!!!~!!77J7^^~!!7Y7!!!!!!!!YJY~!........~PBJ:                            ");
    System.out.println("                                              J#^.............:::::::::~&B::::::.........................................:?!!!!!!!!!!~??!~~!!!!!7Y!!!!!!!J?!!7J! .....75GPYY5YYJJJ!                     ");
    System.out.println("                                              #P...............:::::::::!7:::::..........................................?!!!!!!!!!!77J!!777!!!!!J?!!!!7?J!!!!!J:...........:~Y#B7.                     ");
    System.out.println("                                             ^&7.................:::::::.^BJ::::.................................:....::~77777777777!!!~~~~!77777!J?777?7!!77777?7!:.... .:!YPJ^                        ");
    System.out.println("                                             7&^..................::::::::Y&P::::..................::::::..................:^^~^^:............:~!!!!~::.....::^^^:::.. .7PPJ^                           ");
    System.out.println("                                             7&:....................::::::.^!^~:.::::.......:::::::::::::::............................... ......................... .!BG^                              ");
    System.out.println("                                             !&^.......................:::::.:G&5:::::::::::::::::::::::::::........................:::~!77~^......:::..............!P#7                                ");
    System.out.println("                                             :&7 .........................:::::?GJ::..::::::::::::::::::::::.....:::::::.......:^JGGY^^J5GGPY~:JPY7::::........ .^JGP!                                  ");
    System.out.println("                                              BG................................:::5P?::::::::::::::::::::::........:::::::::~^^Y5Y!::::::::.:::7P#B7::.......:7P#G!.     ...:~^                        ");
    System.out.println("                                              !&^....................:J..........::^5#B~:.:::::::::::::::::..........::::::J##!::..:^^^::::^^:::..:~!^~........:^^!?YY555555G&B.                        ");
    System.out.println("                                              .#Y....................~G^........ ..:.:~^^J!:::::::::::::::...........::::^^J7::::::!:..:^^~:.:!7^:::.^#P:.......... ......~YG7                          ");
    System.out.println("                                               Y#....................:PY!:....:^^:...::::J##J::::::::::::..........:::::P&7.::::::~^...^.5BGJ:5#?::::.?@G..............^?P5~                            ");
    System.out.println("                                               ~&^....................55YY??JYJ7!^....:::.:!7:!!^:::::::........:::::::~B?:::^^^^:^~.....7GB5.!J~^:::::B#::..........^5##?.                             ");
    System.out.println("                                               :&^....................5PJYYYYJ7?7~~....:::::.:7##5^::::::....::::::::::!:.::^~..!::^^:....:^.~J!^~::::.!?:::...........:!?Y5P5?!~:.                     ");
    
    String puzzleGuess = "";
    System.out.println("rfenarsoit");

    while (!puzzleGuess.equalsIgnoreCase("Stop")) { // While the user's answer is not "stop", keep looping

      System.out.print("My guess is: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equalsIgnoreCase("Rainforest")) // Correct guess
      {
        a++; // Add and extra guess
        System.out.println("\nCorrect! You get an extra life!");
        break; // Stop loop
      }

      if (!puzzleGuess.equalsIgnoreCase("Rainforest") && !puzzleGuess.equalsIgnoreCase("Stop")) // Wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
      {
        System.out.println("\nYou gave up and decide to go back and examine a different item");
      }
    }
    return a; // Return guess
  }

  public static int candyWrapper(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "\nYou see a table among the countless rows of peppermint and chocolate. Eagerly, you skip over to the table, only to realize with disappointment that it only has a crumbled, empty candy wrapper on it. However, there's still some hope for you; As you flatten it out, you notice that there is a riddle written on the inside of the wrapper. The riddle reads:\n");
    System.out.println("I have 6 eggs\nI break two of them\nI fry two of them\nHow many unbroken eggs do I have left? \nTASK: INPUT THE CORRECT NUMBER OF EGGS LEFT");
    System.out.println("\nEnter \"Stop\" if you want to give up."); // Gives user an option to give up if they are unable to get the answer

    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("Stop")) { // While the user's answer is not "stop", keep looping

      System.out.print("My guess is: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equals("4")) // Correct guess
      {
        a++; // Add and extra guess
        System.out.println("\nCorrect! You get an extra life!");
        break; // Stop loop
      }

      if (!puzzleGuess.equals("4") && !puzzleGuess.equalsIgnoreCase("Stop")) // Wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
      {
        System.out.println("\nYou gave up and decide to go back and examine a different item");
      }
    }
    return a; // Return guess
  }

  public static int candyVendor(int a) {
    Scanner input = new Scanner(System.in);

    System.out.println(
      "\nAs you traverse through a particularly sweet-smelling patch of land, your eyes fixate on a lone figure in the distance. Intrigued, you pick up the pace until the figure is completely visible to you; it is a chunky bald man, donning a majestic white apron with a candy logo printed on it. A candy vendor! He stands solemnly, hands behind his back, but as he notices you, he grins devishly and holds up a sign with the following symbols on it:\n🍊 + 🍊 + 🍊 = 30\n🍊 + 🍎 + 🍎 = 20\n🍎 + 🍭🍭 + 🍭🍭 = 9\n🍎 + 🍭 + 🍊 = ?");
    System.out.println("\nAs you peer at the sign, he speaks! 'Please, please, pretty please check out this riddle! I'm just a lone man out here trying to hone my logical thinking skills. And I'll reward you if you get this right!'\nYou take a step back, wondering how this bald guy has even survived in this room for so long, but reluctantly agree anyways.\nTASK: FIGURE OUT THE NUMERICAL VALUE OF THE QUESTION MARK IN THE LAST LINE OF THE QUESTION.");
    System.out.println("\nEnter \"Stop\" if you want to give up."); // Gives user an option to give up if they are unable to get the answer

    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("Stop")) { // While the user's answer is not "stop", keep looping

      System.out.print("The total value of all the candies within the last puzzle is: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equals("16")) // Correct guess
      {
        a++; // Add extra guess
        System.out.println(
            "\nRight on the money! The vendor smiles cheekily at you and hands you a piece of candy. As his grubby hands brush yours, you shudder ever so slightly, but he is too excited to notice. You bite into the candy, and immediately begin to feel much better.");
        System.out.println("You get an extra life!");
        break; // Stop loop
      }

      if (!puzzleGuess.equals("16") && !puzzleGuess.equalsIgnoreCase("Stop")) // Wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
      {
        System.out.println(
            "\nSighing, you admit defeat. The vendor's smile drops, and instead, he shook his head in disappointment. You didn't know that you could disappoint someone with so much spirit, butcha did! You gave up and decide to go back and examine a different item");
      }
    }
    return a; // Return guess
  }

  public static int pondOfFudge(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "\nYou randomly decide to look down and spot a small pond of some sort of gooey brown substance. You look around, almost guilty about what you're about to do, and seeing that no one is near you, you bend down and dip your finger into the pond. As you lick your finger, you realize that the brown substance was chocolate fudge! (phew) As you peer into the pond, you see a bunch of floating candy clusters that spell out numbers:");

    System.out.println("                                                                ..~!!!!!!!!?JJ?!~~~!!!!~~~~!~!~~!~~~~~~^~~~^^~~^^^~^^~~!7^^^^!!~^!J?^^!!^..!..:~^..~..^..~^^^:..::^^:..                                 ");
    System.out.println("                                                .:~...::::::^^::^~^::::::........ .............                        ........:::::::^^^:^!^^^7!^^~~:^~^:..^::^^:...      ..                           ");
    System.out.println("                                    .....::^^^^^^^~^^:.....     ..     ..        ..............                        ..     ....         .....::.:::^^^^^!!~~^.............    ...                    ");
    System.out.println("                            .....::^^^^^^:::..    ...           ..    ..:.......:^^^^^^^^^^^~~~^^^^^^^^^^^^^^:::::::::::^:.....:...       ........        ....:^^^^^^::............     ..              ");
    System.out.println("                      ......:^^~^^:...    ...     .........:::^^^~~~~^~~~~^^^^^^^::::::::::.................:::::::::::^^^^^^^~~~~~^~^^^^^^^^^:::..           ...  ..::^^~^:..........                  ");
    System.out.println("                ........:^~~~:.          ...:::::^~~~~^^^^^::::........                                                           ........:::^^^~~~~^^^^::.......        .:^~~~:.........          ..   ");
    System.out.println("          ...   ......~7~:...      ..::^^~~~~^^::.........                                                                                        .....:::^^^~~~~^:...    .....^!!:........            .");
    System.out.println("      ..       .....^J!..  ....:^~~~^^::..........                                                                                                           ...::^^~~~^:.....   :?!........            ");
    System.out.println("   .          .....:5~....:^!!^^:...........                                                                                                                    .......::^~!!^.   .Y~.......            ");
    System.out.println(" .            ......5!.~7!^:............                                                                                                                         ...........:^!!^..Y^.......            ");
    System.out.println("    .          .....:?57.............                                                                                                                            ...............~Y?^......              ");
    System.out.println("    .     ...........:!YJ:..........                                                                                                                           ................7Y?^:..........          ");
    System.out.println("    ..........:^~~~~^:..Y!............                                                                                                                    ....................:5^.:^~~~~^:..........    ");
    System.out.println("..........:~~~~^::.     J7..................                                                                                                    ..............................:5^     .:^^~!~^:........ ");
    System.out.println("......:~!~^.. ........:^?~...........................                                                                                              ...........................:5~.     .   ..:~!~:......");
    System.out.println("....~7!:.     .:^~~~^^::......................    ....                                                                                                              ...........:^^^^^::..     ..:~!~:...");
    System.out.println("..^?~.   ..^^~ 5@@@@!....  #@@@@#          #@@@@@@#      #@@@@@@#         #@@@@@@#      #@@@@@@#          #@@@@@@#     #@@@@@@#                                #@@@@@@#      #@@@@@@# ^~~~^:.....  :?~..");
    System.out.println(".:5:  .~~!~^..P@ @@@@ .^#@@@#B#@@@B:     7&@@@@@@@@G.  5@@@&BB&@@&!     :&@@@BB#@@@G. 5@@@BPP#@@@Y     :&@@@GPP@@@&:  @@@&PPG@@@#                           Y@@@&GPB@@@G. Y@@@&GG#@@@G...:^~!!~.   .J!.");
    System.out.println(".~Y.:!!^:....... @@@@ .#@@@#            !@@@@:  Y@@@& 7@@@&             &@@@          B@@@7  ?@@@G     ^@@@#   B@@@^ 7@@@P   &@@@.                          .@@@@    &@@@Y P@@@    @@@#.......:^!!^. 7J.");
    System.out.println("..JY?:.......... @@@@ :@@@@B??5@@@&^    Y@@@&   ~@@@@.G@@@@J??&@@@Y    :@@@@G??5@@@&:  @@@GJJG@@@       @@@&YJY&@@@   @@@&YJ5@@@&                            ^P#&&&&&@@@@7  @@@B55G@@@  ..........^77Y^.");
    System.out.println("...!J~.......... @@@@ :&@@@5   @@@@7    .&@@@B  @@@@J Y@@@&    @@@#    .&@@@J   @@@@ :@@@@Y  5@@@@:    G@@@&   &@@@G &@@@B   @@@@Y                                   @@@&  @@@@    @@@@7..........^??:..");
    System.out.println(".....~7!^:......######.:JG#&&&&#GY^       ~5B&&&#GJ:   ^YB#&&&#B5!      .7PB&&&&#GJ:  :JG#&&&&#GJ:      !5B#&&&#B5!   7PB&&&&#B5~     @@@@@@@@@ @@@@@@@@@    .7P#&&&&#G7.   JG#&&&&#B5~ .......:!7!:....");
    System.out.println(".......:^!!~^:.................                                                                                                                                              ..............:~!!~:.......");
    System.out.println("...........:^~~!~^:....................                                                                                                                              ................:^~!!~~:........  .");
    System.out.println("................:^^~~~~^^::......................                                                                                                        .....................:^^~~~~~^:.........       ");
    System.out.println(".......................:^^~~!~~^^:::............................                                                                  ..................................:::^^~!!~~^^::..........            ");
    System.out.println("     ..........................::^^~~!~~~~~^^^:::......................................................................................................::::^^^~~~!!~~^^::..........                     ");
    System.out.println("               ..........................::::^^~~~!~~~~~~^^^^^::::::................................................................::::::^^^~^^~~~~~~~~~^^:::..........                                ");
    System.out.println("                         ...............................::::^^^~~~~~!~~~~!!!!!!!~~~~~!!!!~~~~~~~~~^^^^^^~~~~~~~~!!!~~~~~~!!!!!!~~~!!~~~~~^^^::..........        ..                                      ");
    
    
    System.out.println("\nHowever, there is a missing number in the pond. You could just walk away, but now that the pond has caught your attention, you can't stop staring at the missing part. You have to find out what the missing number is! \nTASK: INPUT THE MISSING NUMBER. (HINT: TRY TO ANALYZE THIS FROM A DIFFERENT PERSPECTIVE...)");
    System.out.println("\nEnter \"Stop\" if you want to give up."); // Gives user an option to give up if they are unable to get the answer

    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("Stop")) { // While the user's answer is not "stop", keep looping

      System.out.print("The missing candy number is: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equals("87")) // Correct guess
      {
        a++; // Add and extra guess
        System.out.println("\nCorrect! You get an extra life!");
        break; // Stop loop
      }

      if (!puzzleGuess.equals("87") && !puzzleGuess.equalsIgnoreCase("Stop")) // Wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
      {
        System.out.println("\nYou gave up and decide to go back and examine a different item");
      }
    }
    return a; // Return guess
  }

  public static int candyPile(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "\nAs you stroll through the room, your foot crunches down on something, and you look down at your feet to see a pile of candies scattered on the ground. They all look rather similar, and as you look closer, you see that every candy in the pile has a letter on its wrapper. All 5 letters together spell out the word 'sweet', but you can think of other letter combinations that spell out other words."); 
    

    System.out.println("                                                                               .~~^.                                                                                                                    ");
    System.out.println("                                                                               ~!!!!!:                                                                                                                  ");
    System.out.println("                                                                              ^!!!^~!7!:                                                                                                                ");
    System.out.println("                                                                          .:~!7!~:::^!!!^                                                                                                               ");
    System.out.println("                                                                        .!!7!~^:::::::!!!^        .:^^~~!!!!!~~~^^:..                                                                                   ");
    System.out.println("                                                                        !!!^:::::::::::!!7:   :^!!7!!!~~~~~~~!~^~!!77!~^:.                                                                              ");
    System.out.println("                                                                        !!!^:::::::::::^!!!:^!7!~~^::::::::::.     .:^~!77!~:                                                                           ");
    System.out.println("                                                                        :!!!::::::::::::!!!!!!~:::::::::::.             ..^!77~:                                                                        ");
    System.out.println("                                                                        :!!!:::::::::::^!!!!~::::::::::::                   .:!7!^.                                                                     ");
    System.out.println("                                                                       ^!!!^:::::::^~!!7!!!~:::::::::::.                      :~!7!~.                                                                   ");
    System.out.println("                                                                      ~7!!~^^~~~!!!7!!^:!!!^::::::^B&&&B     ~&&&!     G&#&B^::::~!!!^                                                                  ");
    System.out.println("                                                                     .~~!!!!!!!!~^:.    !!!^:::::::!@@@@B   :@@@@@^   G@@@@7:::::::~!!~                                                                 ");
    System.out.println("                                                                                        ~!!~:::::::::&@@@5 .@@@J@@@: Y@@@@~.::::::::~!!!                                                                ");
    System.out.println("                                                              .~!!^                     .!!!^::::::: .&@@@Y&@@7 !@@&J@@@&~:::::::::::~!!~                                                               ");
    System.out.println("                                                             .!!!!7~.                    :!!!^::::^   .&@@@@@5   Y@@@@@&~:::::::::::::!!!.        ........                                              ");
    System.out.println("                                                            .!!!^^!!!~:::..               :!!!~:::^    .B&&&G     P&&&#~::::::::::::::~!!^  .:^~!!!77!!!!!!!:                                           ");
    System.out.println("                                                            ~!!~:::^~!!!!77!^              .~7!!^::                 :^::::::::::::::::!!!~^!77!!~^^^^::~!!!^                                            ");
    System.out.println("                                                           .!!!^:::::::::^~!!!               :!7!!^                 ^::::::::::::::::^!!!!!!~^::::::::^!!!.                                             ");
    System.out.println("                                                           :!!!::::::::::::!!7.                .~!!~:              :::::::::::::::::^!!!!!::::::::::::!!!:                                              ");
    System.out.println("                                                           .!!!::::::::::::~!!~                  .^!7!~:.          ^::::::::::::::^~!!!!!!::::::::::::~!!^                                              ");
    System.out.println("                                              ..::^^^^::.. .!!!^::::::::::::~!!!:                   .:~!7!~:..     ^::::::::::^^~!7!~: ~!!~:::::::::::^!!!.                                             ");
    System.out.println("                                        .:^~!!77!!!!!!!!77!!!!!~:::::::::::::~!!77^                     .:^!!7!!~^^!~~~~~~!!!!7!!~:.   .!!!^:::::::::^~!!!                                              ");
    System.out.println("                                     :~!777!~^^:::::::::^^~!!!!!!~~~^^^^~~~!!!!!~:                           ..::^~~~~~~~~~^^:..        .!!!^:::::^~!77!^                                               ");
    System.out.println("                                  :~77!^....::::::::::::::::^~!!!!!!!!!!!!!~^:.                                                          .!!!~::^!!7~:.                                                 ");
    System.out.println("                               .^!7!:.         .::::::::::::::^!!!:                                                         :^:.           ^!7!~!!!:                                                    ");
    System.out.println("                             .^!7~.               .::::::::::::^!!!                     ...      .~~^                      .7!7!~:          .^!7!7^                                                     ");
    System.out.println("                            ^!7~.        ...........:~^:::::::::!!!:                 :~!77!!!~~!!7!!7:                    .!!!~!!7~.           .::                                                      ");
    System.out.println("                          .!7!:         ~@@@@@@@@@@@@@7:::::::::!!!:                ~7!~^^^~~~~~~^~!!~                .:^!7!!^::~!!!:                                                                   ");
    System.out.println("                         :!!~           !@@@@B^^^^^^^^  .^::::::!!!:              .!!!~:::::::::::~!!~              .~!7!!~^:::::^!!!.           .........                                              ");
    System.out.println("                        :!!!^:..        !@@@@@#&&&&&B     ^::::^!!!         :^~~!!7!!^::::::::::::!!!:             .!!!^::::::::::^!!!.    .:^~!!!777!7777!!!!~^:.                                      ");
    System.out.println("                       :!!!^::::::.     !@@@@B^~~~~~^      ^:::!!!^         !7!!!^^::::::::::::::~!!!              .!!!^:::::::::::~!!^ .^!77!~~^^^^:::^^^~..:^~!7!~^.                                  ");
    System.out.println("                       !!!^::::::::::.  !@@@@@&&&&&&&&#    .^:~!!~           :!!!~^:::::::::::::^!!!.               ~!!~:::::::::::^!!!~!!!~^:::::::::::::^      .:^!7!~:.                              ");
    System.out.println("                      ^!!!::::::::::::::^5YYY555555555J     .!!!~              :~!7!~^^::::::::^!!!.                ~!!~:::::::::::^!!!!!^:::::::::::::::^.          .:~77~:                            ");
    System.out.println("                      ~!!~:::::::::::::::.                  ^!!~                 .:~!!7!!!~~^^~!!!~::::..         .!!!~:::::::::^~!!!!!!:::::::::::::::::^              .:!7!:                          ");
    System.out.println("                      !!!^::::::::::::::::^.              :!7!:                      ..:^~!!!!!!!!!!!!!7!!~^.    ~7!!!^^^^^~~!!!7!~~!!!^::::::::::::::::^.     ...        .!!7!:                        ");
    System.out.println("                      ~!!~:::::::::::::::::::           :!77~.                           :!!!!~^^::::::^^~!!7!~:.^~~!!!!!!!!~~^:.  .!!!:::::::::::::::::: .Y#&@@@@@@&P^   .^^~!7~.                      ");
    System.out.println("                      .!!!^::::::::::::::::::^        :!77~.                           .~!!!^:::::::::::::::^~!7!^.                .!!!^::::::::::::::^: !@@@@@    ^&&#^  ::::^!!!:                     ");
    System.out.println("                       ^!!!^::::::::::::::::::^    .^!7!^.                            .!!!~::::::::::::::::::::~!7!^                ~!!~:::::::::::::^.   7@@@@&&&&&B     ^::::^!!!:                    ");
    System.out.println("           ..:^~~~!!!~~~!!!!~^::::::::::::::::^^.^!77~:                              .!!!^:::::::::::::::::::::::~!7!:              .!!!^::::::::::::             @@@@G  .^:::::^!!!.                   ");
    System.out.println("        :~!!!!!!~~~~~~~~!!!!!!!~^^^:::::^^^~~!!77!^:                                 ~!!~:::::::::::..             ^!7~              .!!!~:::::::::.     :&@@@@,,B@@@@@^ ^:::::::~!!^                   ");
    System.out.println("       ~77!!~:::::::::::::~!!!~!!77!!!!!77!!!~^..                                   .!!!^:::::::.                   ^!!!.             .!!!~::::::.         ~5B#&&&#B5~  ^::::::::~!!~      ...:::::..   ");
    System.out.println("        .^!!!~::::::::::::^!!!   ...:::....                                         :!!!:::::.    JGGGGGGGGGGGBY     ^!!!.              ^!!!~^.                       .^:::::::::~!!~..^~!!77!!!!!!!!!! ");
    System.out.println("          .!!!~::::::::::::!!!.                                                     ^!!!::.       &@@@@#BBBBBB#P      ^!!!               .^!7!:                      ::::::::::::!!!!!7!!~^^^::::^!!!!. ");
    System.out.println("           :!!!::::::::::::!!!.                                                     :!!!.         #@@@@^^^^^^^^        ^!!~                .^!7!^.                 .:::::::::::^!!!!!~^:::::::::^!!!^   ");
    System.out.println("           .!!!^::::::::::^!!!.                                                     .!!~          #@@@@#BBBBB#!         ~!!.                  .~!7!~^.           .:::::::::::^~!!!!!^:::::::::::~!!~    ");
    System.out.println("            .~!7!!!!~~^:::~!!~                                                       ~!!.         #@@@@^^^^^^^^^^       .!!~                     .^!!77!^:.   .::::::::::^^~!!7!^!!!^:::::::::::^!!!    ");
    System.out.println("              .::^^~!7!!^^!!!.                                                       .!!~         B@@@@@@@@@@@@@Y     . .!!!                         .:~!!77!!!!!!~~!!!!!77!~^.  :!!!::::::::::::!!7.   ");
    System.out.println("                     :!!!!!!.                                                         ^!!:               ..:^^^~^:::::::^!!!.                             ..::^^~~~~~~^^:..       ~!!~:::::::::^~!7!    ");
    System.out.println("                      .~!7!.           ...........                                     ~!!.           ..::::::::::::::::^!!!.                                                      !!!~::::^~!!7!~:     ");
    System.out.println("                        ..      .:^~!!!!!!!!!!!!!!!!!!~^:.                              ~!!:       .::::::::::::::::::::^!!!                                                        ~7!!^:~!!!^.        ");
    System.out.println("                            :^!!7!!!~..           ...:!!!7!~^.                           ^7!^   .:::::::::::::::::::::::~!!^                                                         :!7!!!!~           ");
    System.out.println("    :^^:..               :~!7!!~^:::^.                 ^^^~!!7!~.              .:^~~!!^   :!7~:::::::::::::::::::::::::^!!!                                                            :~!!!.           ");
    System.out.println("   .7!!!77!~:.         ^!7!~^::::::::^                  ^::::^!!7!:         .^!77!!!!!^    .~77!^:::::::::::::::::::::^!!!.                                                               .             ");
    System.out.println("    !!!^^^~!7!~:     :!!!~^::::::::::^.                 .^:::::^~!7!.    .^!7!!~^:^!!!.      .~!7!~^:::::::::::::::::~!!!.                                                                              ");
    System.out.println("   :!!!:::::^~!7!:  :7!!^:::::::::::::!BBBBBBBBBBBBBB.   ^:::::::^!!!:  ^!7!~^::::^!!!.        .^!7!!~^:::::::::::^~!!!^                                                                                ");
    System.out.println("  ^!!!^:::::::^~!7~^!!!^::::::::::::::!BBBB&@@@@&BBBB.   :::::::::^!!!^!!!~::::::::~!!!:          .^~!7!!!~~~~~~!!!!!!~:..                                                                              ");
    System.out.println(".!!!~:::::::::::^!!!!!~:::::::::::::::^    !@@@@J        .^::::::::~!!!!!^::::::::::^!!7~             .:^~~!!!~!!!!!~!!!7!!~^:.                                                                         ");
    System.out.println("~!!!:::::::::::::^!!!!~:::::::::::::::^.   7@@@@Y        .^::::::::^!!!!^:::::::::::::!!7:                    ^!!!^:::::^^~!!7!!^.                                                                      ");
    System.out.println(".~!!~^::::::::::^!!!!!!:::::::::::::::^    7@@@@Y        ::::::::::~!!!!!^:::::::::::~!!!.                   :!!!^:::::::::::^~!!!~.                                                                    ");
    System.out.println("  ^!!!^::::::::~!7!:~!!~:::::::::::::::    !@@@@?        ^::::::::^!!!^!7!~^:::::::^!!!^                    .!!!^:::::::::::::::~!!!~                                                                   ");
    System.out.println("   :!!!:::::^~!7!^   ~!!~^:::::::::::^.                 .^:::::::~!!!:  :!7!~^:::::!!!:                     ~!!~::::::::::::^~!!!!!!!:                                                                  ");
    System.out.println("   :!!!::^~!!7!:      :!7!~^::::::::::                  ^::::::^!!7~.     :~!7!~^^~!!!                     .!!!::::::::::::~!!!^:..                                                                     ");
    System.out.println("   ~!!!!!7!!^.          ^!7!!~^::::::                  ^::::^~!7!~.         .:~!77!!!7.                    :!!!::^^^^^:::^!!7~                                                                          ");
    System.out.println("   ~!!~~^..               .^!77!~~^^                  ^^^~!!7!~:.               ..:^^:                     .7!!!!77!77!!!!7!:                                                                           ");
    System.out.println("                             .:^!!7!!~^^:::::::::::^~!777!~^:                                               ^!!~:.....:^^:.                                                                             ");
    System.out.println("                                  ..:^~~!!!!!!!!!!!~~^:..                                                    ..                                                                                         ");


    System.out.println(
        "\nTASK: USING THE CANDY LETTERS, COME UP WITH 3 WORDS. YOU MAY ONLY USE EACH LETTER ONCE, BUT YOU CAN FORM WORDS THAT HAVE ANYWHERE FROM 3 TO 4 LETTERS. GOOD LUCK!");
    System.out.println("\nEnter \"Stop\" if you've given up."); // Gives user an option to give up if they are unable to find any more words.

    String puzzleGuess = "";
    int counter = 0; // declaring variables; counter counts how many correct words have been inputted
    int myNum = 1;
    String[] possWords = { "Stew", "West", "Wet", "Tee", "Sew", "Set", "See" }; // array of all possible words

    while (!puzzleGuess.equalsIgnoreCase("Stop") && myNum == 1) { // While the user's answer is not "stop", or they haven't reached 3 words keep looping

      System.out.print("Enter your word here: ");
      puzzleGuess = input.nextLine();

      if (counter < 3) // if the number of correctly inputted words is less than 3
      {

        for (int n = 0; n < possWords.length; n++) {
          if (possWords[n].equalsIgnoreCase(puzzleGuess)) // if user input matches with a word in the array
          {
            counter++; // increment the counter
            possWords[n] = "found"; // nullify the already entered word
          }
        }
        System.out.println("You have " + counter + " correct words so far."); // tell user how many correct words they have inputted
      }

      if (counter == 3) // when the user has inputted 3 correct words
      {
        a++; // Add an extra life
        System.out.println("\nCorrect! You get an extra life!");
        myNum = 0; // break out of the loop
      }
    }

    if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
    {
      System.out.println("\nYou gave up and decide to go back and examine a different item");
    }
    return a; // Return guess
  }

  public static int blackHole(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "\nAs you observe the walls of the room, you realize that one section is strangely... filled with movement? As you move closer, you spot a bunch of dust particles, asteroids, meteorites, and other space junk being sucked towards one corner of the room. A black hole! Because you are much too curious for your own good, you decide to investigate, but before you can brace yourself, your legs and arms are sucked inwards until your entire body is within the black hole, and you are surrounded by black-nothingness. Before you know it, you are in a black void, and all you can see are some groups of numbers floating around:");
    
    System.out.println("01000101 01010011 01000011 01000001 01010000 01000101");
    System.out.println("A strange pattern, but one that would be recognizable by anyone who studies computers. Give it a shot and crack the code! \nTASK: DECODE THE MESSAGE AND INPUT IT BACK IN WITH NORMAL ENGLISH LANGUAGE");
    System.out.println("\nEnter \"Stop\" if you'd like to give up");
    
    String puzzleGuess = "";
    while (!puzzleGuess.equalsIgnoreCase("Stop")) {// While the user's answer is not "stop", keep looping
      System.out.print("\nEnter your guess here: ");
      puzzleGuess = input.nextLine();
      if (puzzleGuess.equalsIgnoreCase("ESCAPE")) // correct guess
      {
        a++; // add an extra guess
        System.out.println(
            "\nSuccess! The numbers slowly start to wrap around you and push you out of the void.");
        break; // stop loop
      }

      if (!puzzleGuess.equals("ESCAPE") && !puzzleGuess.equalsIgnoreCase("Stop")) // wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // user gives up
      {
        System.out.println(
            "\nYour attempts at escape are varied and strong, but alas, you give up. Surrounded by nothingness, you drift off to sleep and somehow wake back up in the room you started out in. You then decide to examine a different item");
      }
    }
    return a; // return guess
  }

  public static int starAlignment(int a) {
    Scanner input = new Scanner(System.in);

      System.out.println("                                                             ");
      System.out.println("                             .       .                       ");
      System.out.println("     :                               .       :7.  .          ");
      System.out.println("   .                                 .       ~@@&P:          ");
      System.out.println("   .                                       .^5G&@.           ");
      System.out.println("              .                                 ^: :         ");
      System.out.println("                .    :                                   .   ");
      System.out.println("                                        .                    ");
      System.out.println("           .                    .                            ");
      System.out.println("           . ~&P            :                                ");
      System.out.println("             ...             .         :                     ");
      System.out.println("          .                                                  ");
      System.out.println("         ..  :^:   ..                                        ");
      System.out.println("         ~~    #@&&~                                         ");
      System.out.println("              :#&&@                           :    .         ");
      System.out.println("             ..   .:                   .                     ");
      System.out.println("                          .:          ~B:                    ");
      System.out.println("                 .        ^!         .5@?.      :            ");
      System.out.println("                          YB           :             .       ");
      System.out.println("                  ::     !@@J          :             .       ");
      System.out.println("                       ^B@@@@#!                              ");
      System.out.println("      .         .:^!JB@@@@@@@@@@#Y!^:..                      ");
      System.out.println("  .                  .~P@@@@@@G~.                            ");
      System.out.println("                         P@@B.               ~               ");
      System.out.println("                          G&                7@!     .        ");
      System.out.println("      .                   ~?            ..!B@@@B!.  .        ");
      System.out.println("                          .^                ?@7              ");
      System.out.println("                                             !               ");
      System.out.println("                                                             ");
    
    System.out.println(
        "\nAs you round the corner of the room, you spot a window; it's almost as if you're in a spacecraft! You peek out of the window and see a vast sea of stars, glimmering and shimmering with beauty. You notice, however, that certain stars are shining brighter than others. But why would they shine brighter than the others? You think for a bit, then realize that these stars must be hiding something within. A faint melody echoes throughout your ears, and you realize that these stars are actually placeholders for letters in a song title!\nTASK: FIGURE OUT THE PATTERN OF THE SHINING STARS AND GUESS THE SONG TITLE FOR A CHANCE AT AN EXTRA GUESS! (HINT: 80'S POP SONG)");
    System.out.println("\n***** ***** **** *** **");

    System.out.println("\nEnter \"Stop\" if you'd like to *give us up* and *let us down*");

    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("Stop")) { // While the user's answer is not "stop", keep looping

      System.out.print("\nEnter your guess here: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equalsIgnoreCase("Never Gonna Give You Up"))// Correct guess
      {
        a++; // Add and extra guess
        System.out.println("\nCorrect! Although you just got Rick Rolled, you feel satisfied as you earn an extra life!");
        break; // Stop loop
      }

      if (!puzzleGuess.equals("Never Gonna Give You Up") && !puzzleGuess.equalsIgnoreCase("Stop")) // Wrong guess
      {
        System.out.println("\nWrong answer, please try again.\n");
      }

      if (puzzleGuess.equalsIgnoreCase("Stop")) // User gives up
      {
        System.out.println("\nYou gave up, much to the disappointment of a certain Rick Astley, and decide to go back and examine a different item");
      }
    }
    return a; // Return guess
  }

  public static int spaceship(int a) {
    Scanner input = new Scanner(System.in);

    System.out.println("                                            .~?5PBBBBG5?~.                                          ");
    System.out.println("                                        :7PB####BBBBBB#####P7:                                      ");
    System.out.println("                                     ^5#&&#BBBBGGBBBBBBBBBB##&#5~                                   ");
    System.out.println("                                  ^5#&#BBBBBBB55BBBBBBBBBBBBBBB#&#5^                                ");
    System.out.println("                               :J#&#BBBBBBBBGY?GBBBBBBBBBBBBBBBBBB#&#J:                             ");
    System.out.println("                             ~G&&#BBBBBBBBBGY75BBBBBBBBBBBBBBBBBBBBBB#&B!                           ");
    System.out.println("                          .?GGBB5J5BGYJPBPJ!7JYJYBBYJPBGJJGB5J5BBYJPBPJ5##J.                        ");
    System.out.println("                        .J#Y:!P?..?P7..JP^ .!?: ^PY. !PJ. ?P7 .YP~ :5Y: ^P#&Y.                      ");
    System.out.println("                      .Y&&5. ^PP^ .YG!  7J~  :GG: .PB~  JBY  !GP. :PG~ .JG??B&5.                    ");
    System.out.println("                     7BBPY!~75PJ~~JP5!^!?!~::755!~75PJ~~JP5!~75PJ~~JP5!~75PJYB&#J.                  ");
    System.out.println("                   !BB5YYYY5YYYY55YYYJY?~~!!??YYY5YYYY55YYYY5YYYY55YYYY5YYYYYPB#&#7                 ");
    System.out.println("                 ^GB5YYYYYYYYYYYYYYY??J!~!~!??YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYPBB#&B~               ");
    System.out.println("               .Y#PYYYYYYYYYYYYYYYYJ7Y7~!!~77?YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY5B#B#&5.             ");
    System.out.println("              ~BBYYYYYYYYYYYYYYYYYY7??~~~~~?7JYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY!!5BBB##7            ");
    System.out.println("             Y#PYYYYYYYYYYYYYYY55PYJPJ??JJJPYPGGGGGGGGGGGGGGPGPPPPPPP55YYYYYYYYY!!YBBB#&P.          ");
    System.out.println("           :BBYYYYYYYYYYYYY5PGGGPP55555555555555555555555555555555PPPPGGGGPYYYYYYY5BBBBB&#~         ");
    System.out.println("          !#GYYYYYYYYYYYYPBGP5YYYYYYYYYYYY55P555YYYYYY555555YYYYYYYYYYYY55GBGYYYYYYPBBBBB#&?        ");
    System.out.println("         J#5YYYYYYYYYYYYGB5?7J5YYYYYYY55P5YJ77!!!!!!!!!!!7JY5PP5YYYYYYY?7Y5YBGYYYYYYG#BBBB#&5       ");
    System.out.println("        Y#5YYYYYYYYYYYY5#55?7YGYYYYY5PPY7!!!7?JJYYYYYYJJ?7!!!7J5P5YYYY5?75PY5#PYYYYYYB#BBBB#&G.     ");
    System.out.println("       5#5YYYYYYYYJYYYYPBYY5PPYYYYYPPJ!!!7JYJ7~^::::::^~7JYY7!!!JPPYYYY5P5YYYB#5YYYYY5BBBBBBB&G.    ");
    System.out.println("      5#YYYYYYYJ7^!YYYYGBYYYYYYYY5G57!!7YY!:.        .....:~Y57!!!YG5YYYYYYYYG#PYYYYYYPBBBBBBB&G    ");
    System.out.println("     Y#5YYYYYYYJ::?YYYYBGYYYYYYY5GY!!!J5!.            .......!5Y!!!JG5YYYYYYYP&GYYYYYYYG#BBBBBB&P   ");
    System.out.println("    !&5YYYYYYYYY!~JYYYYBPYYYYYYYG5!!!YP^..           .........:5Y!!!JG5YYYYYY5#BYYYYYYY5BBBBBBB#&?  ");
    System.out.println("   .#GYYYYYYYYYYYYYYYY5#5YYYYYY5P7!!?G~...        .............~GJ!!7PPYYYYYY5#B5YYYYYYYG#BBBBBB#&^ ");
    System.out.println("   5#YYYYYYYYYYYYYYYYY5#5YYYYYYP5!!!Y5.........................!P5!!!5PYYYYYY5##5YYYYYYY5BBBBBBBB&G ");
    System.out.println("  :&PYYYYYYYYYYYYYYYYYP#YYYYYYYP5!!!Y5........................~JP5!!7PPYYYYYJ!G#5YYYYYYY5BBBBBBBB#&~");
    System.out.println("  ?#YYYYYYYYYYYYYY5GGG##YYYYYYYPP7!!JP:......................!?JGY!!?PPYYYYYJ~G#PYYYYYYYYG#BBBBBBB&P");
    System.out.println("  PBYYYYYYYYYYYYYY5#GGBBYYYYYYY5GJ!!!5J....................~?JJPP7!75G5YYYYYYY##PYYYYYYYYGBBBBBBBB#B");
    System.out.println("  BBYYYYYYYYYYYYYYP#5YYYYYYYYYYYPP?!!75Y^..............:^!?J?JPP7!7YGPYYYYYYYY##PYYYYYYYYG#BBBBBBB#B");
    System.out.println("  #GYYYYYYYYYYYYYYP#GGBBYYYYYYYYYPP?!!!JPY?!~^^^^^^~~!7?JJ?J5PY!!7YGPYYYYYYYYY##PYYYYYYY5BBBBBBBBB##");
    System.out.println("  #GYYYYYYYYYYYYYY5BBB##YY??55YYYY5PY7!!!J5P5YJJJJJJJJJJY555J7!7JPG5YYYYJ?Y5YY##PYYYYYYY5BBBBBBBBB##");
    System.out.println("  #GYYYYYYYYYYYYYYYYGB##557!PPYYYYYYPP5J7!!7?YY555555555YJ7!!?YPPPYYYYY5J!JGYY##PYYYYYYYPBBBBBBBBB##");
    System.out.println("  GBYYYYYYYYYYYYYYYYYY5#5Y555YYYYYYYYY5PP5Y?77!!777777777?JY5PP5YYYYYYYY5555Y5##PYYYYYYYG#BBBBBBBB#B");
    System.out.println("  5#YYYYYYYYYYYYYYYYYYYBPYYYYYYYYYYYYYYYY5PPPP55YYYYY555PPPP55YYYYYYYYYYYYYYY5##PYYYYYY5BBBBBBBBBB&P");
    System.out.println("  ?&YYYYYYYYYYYYYYYYYYYBPYYYYYYYYYYYYYYYYYYYY555555555555YYYYYY555555YYYYYYYYP#B5YYYYYYG#BBBBBBBB#&?");
    System.out.println("  ^&PYYYYYYYYYYYYYYYYYYBGYYYYYYYYYYYYYYYYYYYYYYYYY55555555555PP5YYYY5PPYYYYYYP#B5YYYYY5BBBBBBBBBB#&:");
    System.out.println("  .#GYYYYYYYYYYYYYYYYYYGBYYYYYYYYYYYYYYYYYYYYYYYY5P7777?????JYJ???JJ77YP5YYYYG#B5YYYYYPBBBBBBBBBB#G ");
    System.out.println("   5#YYYYYYYYYYYYYYYYYYP#YYYYYYYYYYYYYYYYYYYYYYYYG7              ..!G?!5PYYY7G#GYYYYYYBBBBBBBBGBB&7 ");
    System.out.println("   ^&PYYYYYYYYYYYYYYYYY5#5YYYYYYYYYYYYYYYYYYYYYYYP?::::::^^^^^^^~~!JP7!5G5YYY##GYYYYYPBBBBBBBPGB##. ");
    System.out.println("    G#YYYYYY5YYYYYYYYYYYBPYYYYYYYYYYYYYYYYYYYYYYYPPJJJJJYYYY5555YYYJ775BG7~^7##PYYYY5B##BBBBBBBB&Y  ");
    System.out.println("    ~&PYYYYB#PYYYYYYYYYYGBYYYYYYYYYYYYYYYYYYYYYYYYPP555555555PGG5YY5PGBB5?7~Y#B5YYYYP#B##BBBBBB##:  ");
    System.out.println("     P#YYYY##5YYYYYYYY5PB#YYYYY5YYYYYYYYYYYYYYYYYYYYYYYYYYYYYY5PGGBBBGPY5YYY##BYYYY5BB5B&#BBBBB&Y   ");
    System.out.println("     :#PYY5&B5PYYYYYYBGGB#55Y~!P5YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY5Y!!PPY5##GYYYYG#PYP&#BBBB##.   ");
    System.out.println("      J#55#BYPBPYYYYYB#P55YY5555YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY55P5YYG#BPYYY5BBYYYG&#BB#&!    ");
    System.out.println("       G##G?PB#B5YYYY5#P5PG5YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY##B5YYYGB5YYJ7P&#B&P     ");
    System.out.println("      :GBYYG#BB#GYYYYYG#PG&BYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYP##GYYYP#PYYYYJ7JB&#.     ");
    System.out.println("     J#5JG#BBBBBBPYYYYYPG###5YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYB#B5YY5BGYYYYYYYJ7YBY     ");
    System.out.println("   :BGJPB#BBBBBBBB5YYYYYYPG#GYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYP##GYYYGB5YYYYYYYYY??GB:   ");
    System.out.println("  ^#PJG#BBBBBBBBB#GYYYYYYYY5#5YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYB#B5YYPBPYYYYYYYYYYYJ75#~  ");
    System.out.println(" :#PJB#BBBBBBBBBBBBGYYYYYYYYGBYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYG##GYY5BPYYYYYYYYYYYYYY?P#^ ");
    System.out.println(".BBJB#BBBBBBBBBBBBBBPYYYYYYY5#PYYY55YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY5##B5YYGGYYYYYYYYYYYYYYYYJB#.");
    System.out.println("?#5G#BBBBBBBBBBBBBBBB5YYYYYYYPBY5?!JPYYYYYYYYYYYYYYYYYYYYYYYYYYY57!YPYYB#BGYYPB5YYYYYYYYYYYYYYYYY5&5");
    System.out.println("BB5BBBBBBBBBBBBBBB###BYYYYYYYYGG5Y?YPYYYYYYYYYYYYYYYYYYYYYYYYYYY5YJPPYG##B5Y5B#BGP5YYYYYYYYYYYYYYY##");
    System.out.println("#G5BBBBBBBBBBBB####BB5YYYYYYYYYBG55YYYYYYYYYYYYYYYYYYYYY?JYYYYYYYY5YYP##B5YYG####&#BPYYYYYYYYYYYYYB#");
    System.out.println("BB5BBBBBBBBBBB##B#5YYYYYYYYYYYYYPBBBGGGGGPPPPPPPPPPPPPP57?YYY5GGGGGB###BPYYGBBBBBB#&&#G5YYYYYYYYY5##");
    System.out.println("J#5BBBBBBBBB#&P. J#PYYYYYYYYYYYYY5GB################################BBBPYYP#########?5&#PYYYYYYYYG&5");
    System.out.println(".BGG#BBBBBB##!    7BGGGGGGPPGBBBBBB####################################GPPGBBBBBBBB^  ~##PYYYYYYP##:");
    System.out.println(" ^#GBBBBBB#&~              !P#BBBBBBBBBBB#BGP5YYYYYYYYYPBB#BBBBBBBBBBB#B?.             ^##5YYYYP#&! ");
    System.out.println("  ~##BBBBB&Y             :PBGGGGGGGGGGGBB5JJJJJJJJJJJJJJJY5BBGGGGGGGGGGGBB7             ?&GYYYP#&!  ");
    System.out.println("   ^B&#BB#&^            ~BBBBBBBBBBBBBBB5YYYYYYYJJJJJYYYY5PPGBBBBBBBBBBBBB#5            .##55B&#^   ");
    System.out.println("    .Y####&:           :BBGGGGGGGGGGGBBY???????7!~~~~!???JY55BBGGGGGGGGGGGG#J           .##B##5.    ");
    System.out.println("      :YB#Y            7#BBBBBBBBBBBBBB5555555555YYYY55555GGGB#BBBBBBBBBBBBBG.           ?#BY^      ");
    
    System.out.println(
        "As you traverse the blackness of the room, you suddenly see your reflection. It spooks you a bit, and you jump backwards in terror, before realizing that it's just some metal. You cautiously touch the metal and realize that it seems to be a door to a spaceship. A faint light glows from the chunk of metal, and you peer into it, feeling that getting inside this metal thing might give you another guess. You have to get inside! You walk over to the door.. but its locked.. A button glows red and asks for a 2 digit code, and on the door, there are some equations enscribed. You realize that to enter, you must find the 2-digit code by solving these equations. Math time! \nTASK: SOLVE THE LAST MATH PROBLEM (HINT: YOU DO ACTUALLY NEED TO MULTIPLY THE GIVEN NUMBERS WITH ONE ANOTHER)");
    System.out.println("11 x 11 = 4");
    System.out.println("22 x 22 = 16");
    System.out.println("33 x 33 = 18");
    System.out.println("44 x 44 = 19");
    System.out.println("55 x 55 = ?");

    System.out.println("\nEnter \"Stop\" if you'd like to give up");

    String puzzleGuess = "";

    while (!puzzleGuess.equalsIgnoreCase("stop")) {// while the user's answer is not stop, keep looping
      System.out.print("\nYou decide to enscribe this number into the equation: ");
      puzzleGuess = input.nextLine();

      if (puzzleGuess.equals("10")) {// correct guess
        a++; // add an extra guess
        System.out.println("\nWow! The spaceship door lifts open and you walk inside. You suddenly got another guess!");
        break; // stop loop

      } else if (!puzzleGuess.equals("10") && !puzzleGuess.equalsIgnoreCase("stop")) { // wrong guess
        System.out.println("\nThe door doesn't budge... try guessing again...");
      }

      if (puzzleGuess.equalsIgnoreCase("stop")) { // user gives up
        System.out.println("\nYou give up and decide to go back to examine a different item");
      }
    }
    return a; // return guess
  }

  public static int moonPhase(int a) {
    Scanner input = new Scanner(System.in);
    System.out.println(
        "As you walk, you realize that one of the walls of the room is glowing brighter than the rest. You approach it to see a panel of images of the phases of the moon, strung up on the wall. You notice that under some of the phases, there is an empty label. Time to pull out your moon phase knowledge! \nTASK: LABEL THE MOON PHASE THAT IS DISPLAYED TO YOU 3 TIMES SUCCESSFULLY");

    String[] phase = { "🌕", "🌒", "🌗", "🌘", "🌑" };
    String[] phaseNames = { "Full moon", "Waxing crescent", "Half moon", "Waning crescent", "New moon" }; // Array of moon names and visuals
    int correctGuess = 0;
    int moonIndex = 5;
    String puzzleGuess = "";

    System.out.println("\nEnter \"Stop\" if you want to give up."); // Gives user an option to give up if they are unable to get the answer
    int userNum = 1;

    while (!puzzleGuess.equalsIgnoreCase("stop") && userNum == 1) { // while the user's answer is not stop, keep looping
      Random random = new Random();

      while (correctGuess < 3) {
        int randomIndex = random.nextInt(phase.length);
        
        if (randomIndex != moonIndex) {
          String randomPhase = phase[randomIndex];
          System.out.println(
              "Guess the phase. Your options are: Full Moon, Waxing crescent, Half moon, Waning crescent, and New moon."); // Gives user options
          System.out.println(randomPhase); // Displays the moon phase icon
          puzzleGuess = input.nextLine();

          if (puzzleGuess.equalsIgnoreCase(phaseNames[randomIndex])) { // correct answer
            System.out.println("That is correct! 🎉");
            correctGuess++;
            moonIndex = randomIndex;
          } else { // incorrect answer
            System.out.println("Incorrect, try again.");
          }
        }
        if (correctGuess == 3) { // If user inputted correct answer 3 times, gives user an extra life
          a++;
          System.out.println("\nCongrats, you have guessed 3 times correctly. You get an extra life!");
          userNum++;
        }
         if (puzzleGuess.equalsIgnoreCase("stop")) { // user gives up
        System.out.println("\nYou give up and decide to go back to examine a different item");
      }
    }
    }
    return a; // returns number of lives
  }

  public static int errorTrapIntInputs(char input) { //prevents program from crashing in the event that the player gave a string when they were supposed to enter an integer
    Scanner userInput = new Scanner(System.in);
    while ((int)(input) < 48 || (int)(input) > 57) { //keep prompting user to enter a new input until it is an integer
      System.out.println("You search far and wide but cannot find that object. Please enter a number between 0 and 4.");
      input = userInput.next().charAt(0); 
    }
    int intInput = (int)(input) - 48; //convert from ascii value to integer
    return intInput; 
  }
}