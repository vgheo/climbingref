


#  notes on domain modeling

The domain model contains sub-domains (layers).

- entities : Competition, Route, Competitor
- process:  concepts that model the competition process
	- Attempt
	- WaitingQueue

For the current example, the domain is too simple to see any benefit from splitting.
In general, the process may get quite complicated - so it may make sense to split the sub-domains.

NOTE: The process sub-domain includes Competition Rules - as noted in domain-analysis.
Also, constraints that model physical laws are included in the process sub-domain.
(eg a competitor cannot attempt 2 Routes at the same time).


Q: How to map these 2 domain sub-layers into the implementation layers ?


# design guidelines (sebastian)

- PRINCIPLE : Service layer - should NOT expose DAta Layer / entities
	- SHOULD expose DTOs only

-EG: Container / Bounded Context
	- goal A: serve client interaction
	- goal B: interaction w/ technical layer

- goal: decouple: read logic from write logic

- Use DTO  - instead of real Entities !


EG: Hibernate
	- Entity -> N+1 selects
	- projection of an entity
		- restriction of attributes, relevant for a given context
		- used to minimize generated queries

- Similar:  DTO is a projection of an Entity

- can have several contexts 
	- 