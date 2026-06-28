# CS305-Software-Security
Repo for CS305 Final Project
-Beaumont Bryant


-Briefly summarize your client, Artemis Financial, and its software requirements. Who was the client? What issue did the company want you to address?

Artemis Financial is a multi-national financial institution. They came to us looking to modernize and harden their mobile and web platform.


-What did you do well when you found your client’s software security vulnerabilities? Why is it important to code securely? What value does software security add to a company’s overall well-being?

As I worked through Artemis' codebase I identified weaknesses and applied secure coding practices. Secure coding is critical with Artemis because they handle sensitive information. Vulnerabilities can lead to data loss, unauthorized access, and even legal trouble.


-Which part of the vulnerability assessment was challenging or helpful to you?

The most challenging part of deciphering the vulnerability assesment was knowing which vulnerabilities were important and how to prioritize them. The dependency check showed that third-party libraries can introduce risk, even when the code is functional.



-How did you increase layers of security? In the future, what would you use to assess vulnerabilities and decide which mitigation techniques to use?

I increased layers of security through several avenues. I used checksum validation using SHA-256. I configured HTTPS with a the Java keystore. I also used OWASP's dependency check. In the future I think I would continue to use code those along with: analysis, OWASP, and secure coding practices.



-How did you make certain the code and software application were functional and secure? After refactoring the code, how did you check to see whether you introduced new vulnerabilities?
What resources, tools, or coding practices did you use that might be helpful in future assignments or tasks?

The primary way to know that I avoided adding any security issues is by running the OWASP dependency check prior to changes and then after. Then I would compare and ensure that I did not add any knew security issues.



-Employers sometimes ask for examples of work that you have successfully completed to show your skills, knowledge, and experience. What might you show future employers from this assignment?

I would show the dependency check I ran, along with the checksum algorithm. I think they both show secure coding intentionality.


