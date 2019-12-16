# iebis_swdev_exam_debugging
Somebody from administration wanted to create a random phrase generators and created the code that you can find in Main.java for this purpose.

The intention was to transform students email address to something similar but using slashes ("/") instead of dots ("."). Then he wanted to put a random word in front of the result to create weird sentences.

So for an email address like "john.doe.mis2016@ie.edu" the potential outputs should be one of the following sentences:

```
Your john/doe/mis2016@ie/edu
Four john/doe/mis2016@ie/edu
Tour john/doe/mis2016@ie/edu
```

So basically, every time that you run the code, one of these sentences should be printed in the console, but this is not happening since it seems there's something wrong in the code.

The intention is that these sentences appear with equal equiprobability, so if we would run the code 1000 times, the expected repetitions of each sentence should be close to 333 for each one. Obviously, we can not achieve exactly one third of the times with a random generator, but at least it would be close.

The problem is that nothing of this is happenning now.

Your goal is to fix the code changing the code as little as possible. Obviously we could make some new code that does the same. But that won't score, the goal here is to fix the actual code and find the bugs.

======================================================================

# Instructions
1. Execute the code and see how the outputs differ from the expected.
2. Read the code carefully and figure out what the author tried to do.
3. Then proceed to debug and spot in which points the code is not doing what it apparently does.
4. Looking to documentation online or in IntelliJ, or just using your intuition, fix the code so it performs the requested output.
5. Modify the Readme.md and mention which bugs you found, don't limit yourself to fix them. Explain what you found and why they are bugs.

# Instructions to get the code and present it
1. Up in the GitHub interface you will see a *Fork* button. Click it and choose your account. This will create a copy of this project on your GitHub account.
2. Go to your recently copied project (make sure your user name appear in front of the name of the project).
3. Clone your project into your workspace.
4. Make any modifications to fulfill the requirements in your workspace unsing IntelliJ.
5. Commit your changes.
6. Push it to origin: "git push origin".
7. Add "*Chezlui*" as a collaborator to your project.

## Rules to consider
1. You are free to use Internet to consult resources.
2. *Push any code before the deadline*. Any code presented after the deadline will be scored as 0. Better upload something early than a perfect solution late.
3. Scoring won't take into account any kind of working code. The goal is to spot bugs and fix them (obviusly this will transform the failing code into working code).

## Hints
There are basically 4 bugs in this code. You must spot the 4 of them in order to score all the points, but also be aware of your available time, it's better to upload 3 bugs than nothing.
Scoring criteria:
- 60%: Spot all the bugs
- 20%: Fix all the bugs and push the proposed solution to your repository online
- 20%: Explain the solved exercise in the README, in the best possible way

## BUGS FOUND
1. Line 8
    String formattedEmailAddress = emailAddress.replaceAll(".", "/");  
  The problem was that the "." are not being replaced by "/" by editing the the regex to "\\.", we solve this problem and the "." replace the "."  
    String formattedEmailAddress = emailAddress.replaceAll("\\.", "/"); 
    
2. Line 18, 20, 22
                case 0:
                 word = new StringBuffer('Y');
                case 1:
                    word = new StringBuffer('F');
                case 2:
                    word = new StringBuffer('T');
The Y, F and I are chars and can not be added to a string so we need to convert them to strings.

                           case 0:
                              word = new StringBuffer("Y");
                          case 1:
                              word = new StringBuffer("F");
                          case 2:
                              word = new StringBuffer("T");