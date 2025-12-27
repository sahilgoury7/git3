// A simple AI Agent in Java
public class AIAgent {

    private String name;

    public AIAgent(String name) {
        this.name = name;
    }

    // Agent processes input and gives a response
    public String respond(String input) {
        if (input.toLowerCase().contains("hello")) {
            return "Hi there! I'm " + name + ", your AI agent.";
        } else if (input.toLowerCase().contains("python")) {
            return "Python is great for beginners. Want me to suggest a roadmap?";
        } else {
            return "I'm still learning, but I'll try to help!";
        }
    }

    public static void main(String[] args) {
        AIAgent agent = new AIAgent("NoorBot");

        // Simulating conversations
        System.out.println(agent.respond("Hello Agent"));
        System.out.println(agent.respond("Tell me about Python"));
        System.out.println(agent.respond("Random question"));
    }
}
