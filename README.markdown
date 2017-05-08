# Akka-Http on the Raspberry Pi

This is a follow up test to test how well akka-http runs on a Raspberry Pi (2).

A similar test was done around 2 years ago with spray. See here for details:

* [Blog post on the spray blog](<http://spray.io/blog/2013-07-23-spray-on-the-raspberry-pi/>)

* [Code for old spray blog post](https://github.com/matsluni/spray-template)

Follow these steps to get started:

1. Git-clone this repository.

        $ git clone git://github.com/matsluni/akka-http-rpi.git

2. Change directory into your clone:

        $ cd akka-http-rpi

3. Launch SBT:

        $ sbt

4. Compile everything and run all tests:

        > compile

5. Start the application:

        > run

6. Browse to http://localhost:8080/

7. Create an assembly and deploy to your Raspberry Pi

        > assembly
        
        > scp target/scala-2.11/akka-http-rpi-assembly-0.1.jar pi@raspberrypi:~/
        
8. Start akka-http on the Raspberry Pi

- RPI 1
        
        > ~/jdk1.8.0_66/bin/java -Xss1M -Xms64M -Dakka.actor.default-dispatcher.fork-join-executor.parallelism-max=2 -jar akka-http-rpi-assembly-0.1.jar
    
- RPI 2
   
        > ~/jdk1.8.0_66/bin/java -Xss2M -Xms128M -jar akka-http-rpi-assembly-0.1.jar
        
## Benchmark with [wrk](https://github.com/wg/wrk)
        
    wrk -c 30 -t 20 -d20s http://raspberrypi:8080/
        
In my tests I could reach around 520 Req/sec with this setup, but this setup isn't in any way optimized.
In further tests I want to investigate further and see some backpressure at work.
