# What is the Strategy Pattern?

The Strategy Pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. It lets the algorithm vary independently from the clients that use it.
In simpler terms: It's about having a family of solutions for a specific task (like sorting, compressing, or paying). You can swap these solutions in and out without changing the main code that uses them.

The Core Analogy: Choosing a Route on a Map
Imagine you're building a navigation app:

The Task: Get from point A to point B.

The Strategies: Different routing algorithms.

Fastest Route: Prioritizes time.

Shortest Route: Prioritizes distance.

Scenic Route: Prioritizes beautiful views.

The Process:

Your navigation app (Context) has a "Routing Strategy" slot.

You can plug in any of the concrete strategies (Fastest, Shortest, Scenic).

When you ask for a route, the app delegates the calculation to whatever strategy is currently in the slot.

The key: You can change the strategy at runtime, and the app's core code remains unchanged.
