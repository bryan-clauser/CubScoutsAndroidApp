package com.bsa.android.cubscouts.wolf.data;

import java.util.HashMap;
import java.util.Map;

public class WolfActivityDetail {

	private String name;
	private String description;
	private String required;
	private String notes;
	private String preparation;
	private int position;
	   
	private static final Map<Integer, WolfActivityDetail> detailByPosition = new HashMap<Integer, WolfActivityDetail>();
	    
	private static StringBuilder sb= new StringBuilder().append("Required: one long tent pole (or broomstick)").append("\n")
		.append("Divide team in half.").append("\n")
		.append("Have each half line up facing the other half about 2 feet apart so everyone is across from someone else.").append("\n") 
		.append("Have everyone hold their hands out with index fingers extended like pretending to shoot a gun - have arms bent at elbows.").append("\n") 
		.append("Lay the tent pole on top of everyone's index fingers so they are supporting it.").append("\n") 
		.append("Tell the team that the challenge of the activity is to lower the pole to the ground, following 3 rules:").append("\n") 
		.append("0nly index fingers can touch the pole.").append("\n")
		.append("Everyone's index fingers must touch the pole at all times.").append("\n")
		.append("fingers must remain extended, no grabbing or holding the stick").append("\n")
	    .append("Reflect on how difficult a simple sounding task can be.").append("\n")
	    .append("What was difficult about this?").append("\n") 
	    .append("Did anyone try to cheat?").append("\n") 
	    .append("Who took over leadership?").append("\n") 
	    .append("Were different ideas listened to and tried?").append("\n")
	    .append("What was required to solve the challenge?");

	public static final WolfActivityDetail ACTIVITY1 = new WolfActivityDetail(0, "Anti-Gravity Tent Pole", sb.toString());

	public static final WolfActivityDetail ACTIVITY2 = new WolfActivityDetail(1, "Brain Bender - Water Jugs", "under construction");
	public static final WolfActivityDetail ACTIVITY3 = new WolfActivityDetail(2, "Chinese Numbers", "under construction");
	public static final WolfActivityDetail ACTIVITY4 = new WolfActivityDetail(3, "Evolution", "under construction");
	public static final WolfActivityDetail ACTIVITY5 = new WolfActivityDetail(4, "Marshmallow Kick, Throw, and Blow", "under construction"); 
	public static final WolfActivityDetail ACTIVITY6 = new WolfActivityDetail(5, "Balloon Artists", "under construction"); 
	public static final WolfActivityDetail ACTIVITY7 = new WolfActivityDetail(6, "Balloon Bed", "under construction"); 
	public static final WolfActivityDetail ACTIVITY8 = new WolfActivityDetail(7, "Balloon Juggling", "under construction"); 
	public static final WolfActivityDetail ACTIVITY9 = new WolfActivityDetail(8, "Balloon Olympics", "under construction"); 
	public static final WolfActivityDetail ACTIVITY10 = new WolfActivityDetail(9, "Balloon Symphony", "under construction");
	public static final WolfActivityDetail ACTIVITY11 = new WolfActivityDetail(10, "Balsawood Airplanes", "under construction");
	public static final WolfActivityDetail ACTIVITY12 = new WolfActivityDetail(11, "Bomb the Flame", "under construction");
	public static final WolfActivityDetail ACTIVITY13 = new WolfActivityDetail(12, "Bombs and Shields", "under construction");
	public static final WolfActivityDetail ACTIVITY14 = new WolfActivityDetail(13, "Bull Riders", "under construction");
	public static final WolfActivityDetail ACTIVITY15 = new WolfActivityDetail(14, "Candy Grab Bag", "under construction");
	public static final WolfActivityDetail ACTIVITY16 = new WolfActivityDetail(15, "Chariot Races", "under construction");
	public static final WolfActivityDetail ACTIVITY17 = new WolfActivityDetail(16, "Copycat Collection", "under construction");
	public static final WolfActivityDetail ACTIVITY18 = new WolfActivityDetail(17, "Count to 10", "under construction");
	public static final WolfActivityDetail ACTIVITY19 = new WolfActivityDetail(18, "Count Up Scavenger Hunt", "under construction");
	public static final WolfActivityDetail ACTIVITY20 = new WolfActivityDetail(19, "Coup Sticks", "under construction");
	public static final WolfActivityDetail ACTIVITY21 = new WolfActivityDetail(20, "Critter Creations", "under construction");
	public static final WolfActivityDetail ACTIVITY22 = new WolfActivityDetail(21, "Dark Walkers", "under construction");
	public static final WolfActivityDetail ACTIVITY23 = new WolfActivityDetail(22, "Everybody Up", "under construction");
	public static final WolfActivityDetail ACTIVITY24 = new WolfActivityDetail(23, "Feed Me", "under construction");
	public static final WolfActivityDetail ACTIVITY25 = new WolfActivityDetail(24, "Finding A to Z", "under construction");
	public static final WolfActivityDetail ACTIVITY26 = new WolfActivityDetail(25, "Get to Know You - Cover Up", "under construction");
	public static final WolfActivityDetail ACTIVITY27 = new WolfActivityDetail(26, "Get to Know You - Nuts and Bolts", "under construction");
	public static final WolfActivityDetail ACTIVITY28 = new WolfActivityDetail(27, "Get to Know You - Truth or Lie", "under construction");
	public static final WolfActivityDetail ACTIVITY29 = new WolfActivityDetail(28, "Going Camping", "under construction");
	public static final WolfActivityDetail ACTIVITY30 = new WolfActivityDetail(29, "Gold Rush", "under construction");
	public static final WolfActivityDetail ACTIVITY31 = new WolfActivityDetail(30, "Gotcha", "under construction");
	public static final WolfActivityDetail ACTIVITY32 = new WolfActivityDetail(31, "Great Investments", "under construction");
	public static final WolfActivityDetail ACTIVITY33 = new WolfActivityDetail(32, "Group Counting", "under construction");
	public static final WolfActivityDetail ACTIVITY34 = new WolfActivityDetail(33, "Group Juggling", "under construction");
	public static final WolfActivityDetail ACTIVITY35 = new WolfActivityDetail(34, "Group Jump Rope", "under construction");
	public static final WolfActivityDetail ACTIVITY36 = new WolfActivityDetail(35, "Guess a Minute", "under construction");
	public static final WolfActivityDetail ACTIVITY37 = new WolfActivityDetail(36, "HA!", "under construction");
	public static final WolfActivityDetail ACTIVITY38 = new WolfActivityDetail(37, "Hand Slap", "under construction");
	public static final WolfActivityDetail ACTIVITY39 = new WolfActivityDetail(38, "High Low", "under construction");
	public static final WolfActivityDetail ACTIVITY40 = new WolfActivityDetail(39, "Hole in my Pack", "under construction");
	public static final WolfActivityDetail ACTIVITY41 = new WolfActivityDetail(40, "Human Rain Storm", "under construction");
	public static final WolfActivityDetail ACTIVITY42 = new WolfActivityDetail(41, "Human Robot", "under construction");
	public static final WolfActivityDetail ACTIVITY43 = new WolfActivityDetail(42, "Human Spring", "under construction");
	public static final WolfActivityDetail ACTIVITY44 = new WolfActivityDetail(43, "Hunting Elephants", "under construction");
	public static final WolfActivityDetail ACTIVITY45 = new WolfActivityDetail(44, "Imagine That", "under construction");
	public static final WolfActivityDetail ACTIVITY46 = new WolfActivityDetail(45, "Indoor Miniature Golf", "under construction");
	public static final WolfActivityDetail ACTIVITY47 = new WolfActivityDetail(46, "Its My Lucky Day", "under construction");
	public static final WolfActivityDetail ACTIVITY48 = new WolfActivityDetail(47, "Jimmy Jimmy", "under construction");
	public static final WolfActivityDetail ACTIVITY49 = new WolfActivityDetail(48, "Jumping Bean Relay", "under construction");
	public static final WolfActivityDetail ACTIVITY50 = new WolfActivityDetail(49, "Keep Away", "under construction");
	public static final WolfActivityDetail ACTIVITY51 = new WolfActivityDetail(50, "Leaky Water Barrel", "under construction");
	public static final WolfActivityDetail ACTIVITY52 = new WolfActivityDetail(51, "Licorice Knots", "under construction");
	public static final WolfActivityDetail ACTIVITY53 = new WolfActivityDetail(52, "Log Convoy", "under construction");
	public static final WolfActivityDetail ACTIVITY54 = new WolfActivityDetail(53, "Mafia", "under construction");
	public static final WolfActivityDetail ACTIVITY55 = new WolfActivityDetail(54, "Magnified Movements", "under construction");
	public static final WolfActivityDetail ACTIVITY56 = new WolfActivityDetail(55, "Mars Rover", "under construction");
	public static final WolfActivityDetail ACTIVITY57 = new WolfActivityDetail(56, "Medicine Pouches", "under construction");
	public static final WolfActivityDetail ACTIVITY58 = new WolfActivityDetail(57, "Micro Scavenger Hunt", "under construction");
	public static final WolfActivityDetail ACTIVITY59 = new WolfActivityDetail(58, "Mixed Up Questions", "under construction");
	public static final WolfActivityDetail ACTIVITY60 = new WolfActivityDetail(59, "Nano Nature Trail", "under construction");
	public static final WolfActivityDetail ACTIVITY61 = new WolfActivityDetail(60,"Opposite Actions", "under construction");
	public static final WolfActivityDetail ACTIVITY62 = new WolfActivityDetail(61, "Paper Shuffle", "under construction");
	public static final WolfActivityDetail ACTIVITY63 = new WolfActivityDetail(62, "Pass the Bead", "under construction");
	public static final WolfActivityDetail ACTIVITY64 = new WolfActivityDetail(63, "Passing Race", "under construction");
	public static final WolfActivityDetail ACTIVITY65 = new WolfActivityDetail(64, "Patrol Staff", "under construction");
	public static final WolfActivityDetail ACTIVITY66 = new WolfActivityDetail(65, "Point North", "under construction");
	public static final WolfActivityDetail ACTIVITY67 = new WolfActivityDetail(66, "Police the Site", "under construction");
	public static final WolfActivityDetail ACTIVITY68 = new WolfActivityDetail(67, "Pooh Sticks", "under construction");
	public static final WolfActivityDetail ACTIVITY69 = new WolfActivityDetail(66, "Psychic Hand Shake", "under construction");
	public static final WolfActivityDetail ACTIVITY70 = new WolfActivityDetail(69, "Ring on a String", "under construction");
	public static final WolfActivityDetail ACTIVITY71 = new WolfActivityDetail(70, "Rock, Paper, Scissors Hike", "under construction");
	public static final WolfActivityDetail ACTIVITY72 = new WolfActivityDetail(71, "RPS Snake", "under construction");
	public static final WolfActivityDetail ACTIVITY73 = new WolfActivityDetail(72, "Sand Art", "under construction");
	public static final WolfActivityDetail ACTIVITY74 = new WolfActivityDetail(73, "Scout Bucks Auction", "under construction");
	public static final WolfActivityDetail ACTIVITY75 = new WolfActivityDetail(74, "Skin the Snake", "under construction");
	public static final WolfActivityDetail ACTIVITY76 = new WolfActivityDetail(75, "Soda Pop Detectives", "under construction");
	public static final WolfActivityDetail ACTIVITY77 = new WolfActivityDetail(76, "Spider Web", "under construction");
	public static final WolfActivityDetail ACTIVITY78 = new WolfActivityDetail(77, "Spy Stalking", "under construction");
	public static final WolfActivityDetail ACTIVITY79 = new WolfActivityDetail(78, "Telephone and Bullhorn", "under construction");
	public static final WolfActivityDetail ACTIVITY80 = new WolfActivityDetail(79, "Telephone Pole Shuffle", "under construction");
	public static final WolfActivityDetail ACTIVITY81 = new WolfActivityDetail(80, "Three Monkeys", "under construction");
	public static final WolfActivityDetail ACTIVITY82 = new WolfActivityDetail(81, "Tin Soldiers", "under construction");
	public static final WolfActivityDetail ACTIVITY83 = new WolfActivityDetail(82, "Touch Stick", "under construction");
	public static final WolfActivityDetail ACTIVITY84 = new WolfActivityDetail(83, "Trolley Shuffle", "under construction");
	public static final WolfActivityDetail ACTIVITY85 = new WolfActivityDetail(84, "UnRavel the Group", "under construction");
	public static final WolfActivityDetail ACTIVITY86 = new WolfActivityDetail(85, "Wacky Animals", "under construction");
	public static final WolfActivityDetail ACTIVITY87 = new WolfActivityDetail(86, "Who Am I?", "under construction");

    private WolfActivityDetail(int position, String name, String description, String required, String preparation, String notes) {
    	this.name = name;
    	this.description = description;
    	this.required = required;
    	this.preparation = preparation;
    	this.notes = notes;	    	
    	this.position = position;
    	detailByPosition.put(Integer.valueOf(position), this);
    }

    private WolfActivityDetail(int position, String name, String required) {
    	this.name = name;
    	this.required = required;
    	this.position = position;
    	detailByPosition.put(Integer.valueOf(position), this);
    }

    public static WolfActivityDetail fromPostion(int position) {
	   	return detailByPosition.get(position);
	}
	    
	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getRequired() {
		return required;
	}
	
	public String getPreparation() {
		return preparation;
	}

	public String getNotes() {
		return notes;
	}

}
