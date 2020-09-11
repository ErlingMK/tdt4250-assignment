# tdt4250-assignment

## Current structure
![image](https://user-images.githubusercontent.com/22314146/92926945-1c1bfc80-f43d-11ea-960b-6ca8d8f7e9ca.png)

The project contains two root instances `StudyPlans.xmi` and `Courses.xmi`. `StudyPlans.xmi` is an example of the `Programvaresystemer` specialisation. `Courses.xmi` just holds the `Course` objects, since those are modelled to be independant of a study plan.

#### Constraints
There are constraints in both Java and Acceleo. The constraints in java code have not been tested yet, will do that for the next deadline. 

#### Derived feature
There is one derived feature(`percentOfProgramme` in `Programme`) calculating how big a part a specialisation is of the whole programme. Not directly asked for in the case but couldn't think of a natural derived feature with the current model.

### Remarks

#### StudyPlan
This model is here so I can possibly expand later with a student context for the optional part of the assignment. Would also require setting a max and min number of courses to meet credit requirements.

#### Course Criteria
Slightly unsure about this model and its use. The idea is to identify if the courses added matches the criteria of the chosen programme, specialisation and semester. Will most likely have to update this later.
