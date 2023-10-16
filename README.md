# A practical secret voting scheme for large scale elections
**Project coordinator: Iftene Sorin**
* Bucataru Cristian
* Ciulin Alexandru
* Ionescu Paul
### Implementation of "A practical secret voting scheme for large scale elections"
The proposed system enables students to evaluate their teachers anonymously through a secure voting scheme. The system is composed of students (voters), an administrator, and a counter. The process starts with the students filling out an evaluation form (ballot), which is then encrypted using a blind signature technique. This encrypted form is sent to the administrator who, after verifying the student's eligibility, signs the encrypted form and sends it back to the student. 

The students then send their signed, encrypted evaluations to the counter via an anonymous communication channel. The counter collects all the evaluations and publishes a list of received ballots. To maintain anonymity during the opening stage, students send their encryption keys anonymously, allowing the counter to decrypt the evaluations. The counter checks the validity of each evaluation, counts them, and then announces the results. This process ensures the anonymity of the students, while also ensuring fairness in the evaluation process.
