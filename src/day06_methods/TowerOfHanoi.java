package day06_methods;

public class TowerOfHanoi {

    public void tower(int n, char source, char helper, char destination) {

        if (n == 1) {
            System.out.println("Move Disk 1 from " + source + " to " + destination);
            return;
        }

        tower(n - 1, source, destination, helper);

        System.out.println("Move Disk " + n + " from " + source + " to " + destination);

        tower(n - 1, helper, source, destination);
    }

    public static void main(String[] args) {

        TowerOfHanoi obj = new TowerOfHanoi();

        obj.tower(3, 'A', 'B', 'C');
    }
}
/*
* What is Tower of Hanoi?
Suppose you have 3 rods:

A       B       C
(Source)(Helper)(Destination)

Initially, all disks are on rod A.

Example for 3 disks:

    1
   2
  3
-------
A   B   C

Goal:
Move all disks from A to C.

Rules:
Move only one disk at a time.
Only the top disk can be moved.
A larger disk cannot be placed on a smaller disk.
*
* Visual Representation

Initial

A        B        C
1
2
3

Final

A        B        C
                 1
                 2
                 3
 */