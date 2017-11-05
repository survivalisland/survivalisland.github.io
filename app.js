function getName() {
    var name = document.getElementById("name").value;
    //alert(name);
    appendText("All right then, " + name + ", let's get started!");
}
function wait(ms) {
    var start = new Date().getTime();
    var end = start;
    while (end < start + ms) {
        end = new Date().getTime();
    }
}
var int = 0;
//true = 1, false = 2
function story(text = Array, question = String, correct = String, incorrect = String) {
    this.text = text;
    this.question = question;
    this.correct = correct;
    this.incorrect = incorrect;
}
var story1 = new story(["You are on a plane. Suddenly, the plane's engine explodes."], "What do you do? (1) Cry  (2) Grab a parachute and jump", "1", "2");
var story2 = new story(["Your crying attracts the attention of a flight attendant, who puts a parachute on you and kicks you off the plane.", "You pull the cord and slowly drift onto an island.", "You take off the parachute and see a forest."], "What do you do? (1) Explore (2) Go for a swim", "2", "1");
var story3 = new story(["You wade into the warm ocean water. You sure are having fun!", "Eventually you get tired and go back on shore.", "The sun is setting and you're cold.", "You sure are bad at planning ahead."], "What now? (1) Cover yourself with sand and go to sleep (2) Try to find shelter in the forest", "2", "1");
var story4 = new story(["You go into the forest and find a comfy rock to sleep on.", "You cover yourself with ferns and close your eyes.", "You wake up the next day. Your stomach grumbles."], "What do you do?  (1)Sleep to conserve energy (2) Eat those weird looking berries ", "2", "1");
var story5 = new story(["Those berries taste real good.", "Wow, you just found a food source. Good job!", "You are no longer hungry."], "What do you want to do? (1)Try to make a shelter (2)Look for more food ", "1", "2");
var story6 = new story(["You spend the rest of the day collecting material for your house.", "However, it is too dark to keep building your house at night."], "What do you do?(1)Try anyway (2) Go to sleep on your cold rock again ", "1", "2");
var story7 = new story(["You build the frame for your shelter.", "You try to lift a heavy chunk of wood.", "You drop it on your foot.", "Now your foot is hurt, bozo."], "What do you do? (1)Try to keep working (2) Make a splint ", "2", "1");
var story8 = new story(["You succesfully splint your foot.", "You go to sleep in your half-finished shelter.", "You wake up. Your foot does not hurt as much anymore.", "You finish building your house."], "What now? 1)Eat some berries (2)Try to make a boat", "1", "2");
var story9 = new story(["Those berries taste really good.", "You decide you're never going to make it off the island on your own.", "That means you need to survive until rescuers arrive."], "What do you do to survive?(1)Continue making your house (2)Eat ALL the berries", "2", "1");
var story10 = new story(["You eat all the YUMMY berries.", "Those berries energize and uplift you."], "Now that you are fully awake, what do you want to do? (1)Make weapons (2)Make some friends", "2", "1");
var story11 = new story(["You explore the forest and look for some friends.", "You encounter a baby pig."], "What do you do? (1)Pet it (2)Give it some berries", "2", "1");
var story12 = new story(["The pig eats all the YUMMY berries.", "The pig now follows you around.", "You just made a friend! You name him Piglet."], "What do you want to do with Piglet? (1)Train your friend to fight (2)Go play in the ocean", "2", "1");
var story13 = new story(["You and Piglet go into the ocean.", "You have fun until the sun sets.", "You and Piglet head back to your shelter.", "You go to sleep with Piglet.", "You wake up the next day and eat berries with Piglet."], "What now?  (1)Spell out 'Help!' on the beach (2)Learn how to make fire", "1", "2");
var story14 = new story(["You go to the beach with some rocks.", "You spend a couple hours arranging the rocks in the perfect position.", "Now people can see that you need help. Congrats!"], "You have some time to kill before nightfall. What do you do? (1)Lay around and do nothing (2)Find something to eat other than berries", "1", "2");
var story15 = new story(["You sit on the beach and relax in the sun.", "Eventually you get hot and crawl into the shade.", "You are so bored, you go to sleep early.", "You wake up the next day to the sound of a helicopter.", "A man drops down from a rope ladder and walks toward you..."], "Who is it ?! (1) Snoop Dogg (2) The Babadook", "1", "2");
var sayings = [story1, story2, story3, story4, story5, story6, story7, story8, story9, story10, story11, story12, story13, story14, story15];
function showSelection() {
    $("#content").append("<p class='choice'>1: <input type='radio' name='choice' value='1' class='choice'></p><p class='choice'>2: <input type='radio' name='choice' value='2' class='choice'></p>");
    $("#content").append("");
}
function hideSelection() {
    if (int >= 0) {
        var parent
        $(".choice").remove();
    } else {

    }
}
function clearScreen() {
    $("#main").empty();
    $(".choice").remove();
    $("#next").remove();
}
function checkSelection(correctAnswer = String, incorrectAnswer = String) {
    var selected = $('input[name=choice]:checked').val()
    if (correctAnswer == selected) {
        int++;
    } else if (incorrectAnswer == selected) {
        death();
    } else {
        clearScreen();
        appendText("Fatal Error. Please reload.");
    }
}
function death() {
    clearScreen();
    switch (int) {
        case 1:
            appendText("You leap out of the burning plane.");
            appendText("Unfortunately, your parachute doesn't open.");
            appendText("You died!");
            break;

        case 2:
            appendText("While you are exploring, you find a wild boar.");
            appendText("It kills you.");
            break;

        case 3:
            appendText("That sand feels nice.");
            appendText("A giant crab apppears and eats you.");
            appendText("You died!");
            break;

        case 4:
            appendText("You wake up a few hours later.");
            appendText("You are so hungry you can barely move.");
            appendText("You lay on your rock until a wild boar eats you.");
            appendText("You died!");
            break;

        case 5:
            appendText("You find a couple of coconut trees and try to climb them.");
            appendText("Suddenly, a coconut falls on your head.");
            appendText("You died!");
            break;

        case 6:
            appendText("You lay down on your rock.");
            appendText("During the night, a giant bird grabs you.");
            appendText("You get eaten.");
            appendText("You died!");
            break;

        case 7:
            appendText("Your foot hurts, but you don't care.");
            appendText("You raise a slab of stone over your head.");
            appendText("Your foot gives out and you drop the rock on your head.");
            appendText("You died!");
            break;

        case 8:
            appendText("You get some wood for your boat.");
            appendText("You realize that you do not know how to build a boat either.");
            appendText("You sit down and start crying.");
            appendText("A wild boar appeared!");
            appendText("The boar attacked you and gored you with its tusks.");
            appendText("You died!");

            break;

        case 9:
            appendText("You try to put a roof over your head.");
            appendText("You go inside your house and survey your work.");
            appendText("The roof collapses over your head..");
            appendText("You died!");
            break;

        case 10:
            appendText("You need weapons to survive. You pick up some sticks and shiny rocks.");
            appendText("The rock shines some light into the eye of a giant bird .");
            appendText("The giant bird swoops down and eats you.");
            appendText("You died!");
            break;

        case 11:
            appendText("As you pet the pig, a shadow falls over you.");
            appendText("It's the pig's mom!");
            appendText("She eats you.");
            appendText("You died!");
            break;

        case 12:
            appendText("You put a pointy rock in Piglet's mouth.");
            appendText("Piglet stabs you and steals your berries.");
            appendText("You died!");
            break;

        case 13:
            appendText("You smack some rocks together, which creates sparks.");
            appendText("Those sparks spread to the dead plants on the forest floor.");
            appendText("The entire island is set on fire.");
            appendText("You died!");
            break;

        case 14:
            appendText("You find a new type of berry.");
            appendText("You pop them into your mouth and fall unconscious.");
            appendText("They were poisonous.");
            appendText("You died!");
            break;

        case 15:
            appendText("Why would you choose the Babadook?");
            appendText("Well guess what?");
            appendText("You died!");
            break;

        case 16:
            appendText("You ask Snoop Dogg if he is here to help.");
            appendText("He replies 'Fo shizzle, go watch some televizzle.'");
            appendText("He brings you and Piglet back to the mainland and you live happily ever after.");
        default:
            clearScreen();
            appendText("Fatal Error. Please reload.");
    }
    var days = (int) / 3
    if (days == 1) {
        appendText("You survived for " + days + " day.");
    } else {
        appendText("You survived for " + Math.round(days) + " days.")
    }
    if (days < 3) {
        appendText("That's pretty lame.");
    } else if (days == 3 || days > 3 && days <= 5) {
        appendText("That's pretty good!");
    } else if (int > 15) {
        appendText("Congrats on surviving!");
    }
}
var i = 0;
var q = 0;
function next() {
    if (int < 16) {
        if (int == 0) {
            getName();
            int++;
        } else if (q == 0 && i < (sayings[int - 1].text).length) {
            hideSelection();
            appendText(sayings[int - 1].text[i]);
            i++;
        } else if (q == 0) {
            i = 0;
            q = 1;
            appendText(sayings[int - 1].question);
            showSelection();
        } else {
            q = 0;
            checkSelection(sayings[int - 1].correct, sayings[int - 1].incorrect);
        }
    } else {
        death();
    }
}
function appendText(input) {
    var element = document.createElement("P");
    var text = document.createTextNode(input);
    element.appendChild(text);
    document.getElementById("main").appendChild(element);
}
