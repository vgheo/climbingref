
# Entities

## Competition 
Climbing event where several Competitors compete by attempting to climb a set 
of pre-defined Routes

Has a duration determined by a start and end moments.

- name : String
- state : CompetitionState
- startTime : Date
- endTime : Date
- routes : Route[*]
- competitors : Competitor[*]


### CompetitionState
- PREPARING
	- registration of Competitors
	- definition of routes
	- definition of duration
	- 
- ONGOING
	- update of waiting queues
	- attempts
- FINISHED
	- no changes

## Competition Rules
Set of rules that must be observed by Competitors in order to achieve valid successful Attempts

## Competitor
 Participant in a Competition
 Attempts to climb Routes 

- id : String
	- unique in scope of Competition
- name : String
 
## Organizer
Person that facilitates the Competition

## Referee
Person in charge of ensuring that the Competition Rules are observed
- validates Attempts

Variant: No referees. Attempts are valid by default.

## Route
A path on a climbing wall set up for climbing by competitors.

- id:String
- pastAttempts : Attempt[*]
- activeAttempt : Attempt[0..1]
- waitingQueue : WaitingQueue


## Attempt
A process of determined duration where one Competitor attempts to one Route

An attempt has an outcome of AttemptOutcome.

- competitor : Competitor
- route: Route
- outcome : AttemptOutcome
- startTime
- endTime

Constraint: At any moment, at most one Attempt can be active for a given Route.
Constraint: At any moment, at most one Attempt can be active for a given Competitor
	 - physical; funny

VariationPoint: 	 

## AttemptOutcome
- Unknown - outcome not yet known
- Success - climber succeeded to reach the top of the Route, observing all of the Competition rules
- Failed - climber did not succeed
- Canceled - attempt was canceled before starting


Possible reasons for Failed attempts:
	- disqualified by Referee (eg. broken rules, time exceeded)
	- competitor gives up

## WaitingQueue
A waiting queue of Competitors.
See Route for usage.

- queue : Competitor[*] {ordered}

Note: Essential for fulfilling the information system goals of reducing waiting times and maximizing route 
utilization.

# Potential enhancements
- Competition has multiple Series
- Competition has multiple Categories
	- A Competitor is registered in one Category
	- A Category has an associated subset of Routes




