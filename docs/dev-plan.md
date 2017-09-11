
# Intro
- Domain Concepts are defined in /domain-analysis

#INC0 Setup

- Initial analysis
- Initial Architecture
	- decision on technologies
- Dev Environment setup
- Code project setup


# INC1-MVP
## S1. setup basic competition
As an Organizer, I want to setup a new basic Competition

Data Model Scope:
Competition
- name
- routes : Route
	- id
- competitors : Competitor
	- id
	- name

## S2. change wait queue
As an Organizer, I want to update the wait queues of defined Routes,
so that Competitors know which routes they can climb next

Operations
- Add Competitor at the end
- Remove Competitor from queue

Data Model:
Route 
- waitingQueue : WaitingQueue

## S3. Start/End Attempt
As an Organizer, I want to start/end Attempts for any Route,
so that the competition can proceed as reflected by the information system

Operations
- start Attempt for Route R
	- only for free route and non-empty queue
	- With the next competitor in queue
- end active Attempt for Route R
	- with specified outcome : AttemptOutcome

Data Model Scope
- Route
	- pastAttempts : Attempt[*]
	- activeAttempt :Attempt
	- waitingQueue : WaitingQueue
-WaitingQueue
	- queue
- Attempt
	- route
	- competitor
	- outcome

## S4. As a Competitor/Public/Organizer, I want to see the current
waiting queue for all routes, so that I have an overview of what's next


## Goal fulfillment
G-MINT - 
G-MXRU


## Technology
- web :
	ALT1: SpringMVC/
- Spring Data

# INC-angular

Technology
	ALT2: Spring MVC/AngularJS/ REST

# INC-swf
Spring Webflow



# INC3. Secure access

S2.1. Competitor UI - attempts
As a Competitor, I want to start/end my attempts, so that I do not have to wait 
for the Organizer to do that 

S2.2. Competitor UI - wait queue 
As a Competitor, I want to add/remove myself from wait queues, so that I do not have to wait 
for the Organizer to do that 

S2.2. Security
- All Users connected to the system's UI shall be authenticated
- Operations execution shall be authorized
	- according to functional requirements

## Technology
- Spring Security

# INC3. Scalability 
S3.1. Global event
For global ( :) ) competitions the system shall be able to process 1M ops/s.
- Up to 1M Routes
- Up to 1M Competitors

## Technology
- Microservices?





