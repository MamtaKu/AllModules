[LLD.txt](https://github.com/user-attachments/files/25087582/LLD.txt)
[LLD1.txt](https://github.com/user-attachments/files/25087583/LLD1.txt)[LLD4.txt](https://github.com/user-attachments/files/25087587/LLD4.txt)
[LLD3.txt](https://github.com/user-attachments/files/25087585/LLD3.txt)
[LLD2.txt](https://github.com/user-attachments/files/25087584/LLD2.txt)
[LLD4.txt](https://github.com/user-attachments/files/25087657/LLD4.txt)
Project Module Curriculum
-> Version Control -> Git
-> Spring Boot -> MVC
-> API's -> REST API
-> Microservices
-> Calling third part API's
-> Database -> Connect SpringBoot Application with Database
-> Unit Testing -> JUnit
-> Authentication & Authorization -> OAuth2, JWT Tokens
-> Deployment -> AWS, EBS, RDS, EC2 ---
-> Pagination/Sorting/Searching
-> Payment Gateway -> RazorPay/Stripe
-> Redis
-> Kafka
-> Load Balancer
-> Docker
-> Kubernetes

Q.1 About Version Control System ?
Ans. 
1. It maintains history of codebase.
2. It maintains Different versions of codebase
3. Developer info who made a particular change

Q.2 Types of VCS?
Ans. 1. Centralized, 2. Distributed

Centralized VCS: Codebase is present at our centralized place.
Ex: Code is available on google doc and to access it we ned good internet.
Problem with this is, 
1. All the developers can face conflicts as all are working with one codebase.
2. Server can fail
3. Developer needs n/w connection in order to make code changes
4. We are not allowed the codebase bcoz its centralized and can be avialble at one place.

Pros: Codebase will be at one place so it is more secured.

Distributed Version Control:
1. Every developer can download the codebase in their local and work and this is called cloning.
2. There will be no conflicts as all are working with local copy.
3. Developers can work on the code base without n/w connection but saving the changes to the permanent place then we need to push the code and we need internet as well.
4. Saving the changes in local is called as commit.
5. Push the changes to main copy of codebase and we need internet connection to push the code.

Con: There is the most chances of merge conflicts which happens when 2 or more developers trying to push the code changes done with same line.

Q. 3 What is Git?
Ans. Git is s Distributed Vesion control system.
Git was developed by Linns Torvalds who buids most famous operating system Linux. He faced issue with linux to mange code and store code chnages information and all. so he developed Git.

Q.4 What is GitHub?
Ans. We keep aur code at remote location so any other developer alsoc an download and work. So this remote server where we manage the remote repository of our codebase is called GutHub. Githab has replications od our code base internally. Github is a cloud company which do all for us. WE have other companies like bitbucket and Gitlab etc.

Q.5 What are Git commands?
Ans. 
Commands:
1. Git is software so we have to install it. 

Step1 : Install Git on Your System
Download from git-scm.com and install.

Step 2: Configure Git in IntelliJ IDEA

1. Open IntelliJ IDEA.
2. Go to File > Settings (or IntelliJ IDEA > Preferences on macOS).
3. Navigate to Version Control > Git.
4. In the Path to Git executable field, IntelliJ usually auto-detects Git. If not:
   On Windows: C:\Program Files\Git\bin\git.exe
5. Click Test to verify IntelliJ can communicate with Git.
6. Click OK to save.

Step 3: Set Up Git in Your Project

1. Open your project in IntelliJ.
2. Go to VCS > Enable Version Control Integration.
3. Choose Git from the dropdown.
4. IntelliJ will initialize a Git repository if one doesn’t exist.

2. git init:  we want to maintain whatever code changes happening in codebase folder, we have to do git init which means git initialization means initialize this folder as a git repository. If we don't do git init then git will not look at this code folder and will not manage the code history and not able to use git commands.
3. git add file_name_1, file_name_2, file_name_3  -> to add particular files
4. git add .  -> to add all files
5. git commit -m "Any message"
Note: when we do Commit, it has commit id, author id, timestamp , message etc. So commit id will be unique for each commit. Once a commit is created, it can not be updated  or deleted.

If something can not be updated or deleted, then how reverts work. Revert is a new commit that reverses the change of particular commit.

6. git status -> It will show modified files after last commit
7. git diff -> It will show what changes done from last commit.
8. git commit --amend -> If the commit is local (not pushed yet): This opens your default editor (like Vim or Notepad) to edit the last commit message.
After editing, save and close the editor.
The commit message will be updated.
9.  git commit --amend
git push --force  -> If the commit is already pushed to remote (e.g., GitHub): You can still amend it, but you’ll need to force push, which can be risky if others are working on the same branch.
Warning: Force pushing can overwrite history. Only do this if you're sure no one else is working on the branch or you’ve coordinated with your team.
10. git rebase -i HEAD~n -> To change an older commit message (not the last one): Use interactive rebase
Replace n with the number of commits you want to go back. For example, HEAD~3 to edit the last 3 commits.
In the editor, change pick to reword for the commit you want to edit.
Save and follow the prompts to update the message.
Then push with --force if the commits were already pushed.
11. git branch f1 -> It will create a new branch f1 from last tip of commit but it it not active branch yet. Pointer is still on main branch. if we do commit then it will go to main branch only not on created branch.
12. git checkout f1 ->  now pointer will move from main to f1.
13. git checkout main -> first we go to main branch from f1 and pointer will also come to active branch which is main now.
14. git merge f1 -> now f1 will get merged into main
15. git branch -a -> will give all the branches available in repository.

Note: To learn git commands we can use this website - https://learngitbranching.js.org/

Q.6 What is git branching?
Ans. Branch is nothing but the pointer that point to the latest commit in that branch.
Note: Commit having only delta changes from the last commit. Its not having entire codebase.
c0 -> c1 -> c2 -> c3<-- main*
C0 is the first commit and c3 is the latest commit and main branching is pointing to c3 which is the latest commit(latest commit is the tip of the branch). and we have star(*) on branch which represents current active branch. When we are present in any branch and do commit then that commit will be part of that active branch.
if we do one more commit c4, then pointer will move to c4. This happens when we do "git commit", it will save and pointer will also move.
c0 -> c1 -> c2 -> c3 -> c4<-- main*

11. git branch f1 -> It will create a new branch f1 from last tip of commit but it it not active branch yet. Pointer is still on main branch. if we do commit then it will go to main branch only not on created branch.
Always create branch from main branch as other branch can have code brak etc. Because main is the stable code which is running in production.

12. git checkout f1 ->  now pointer will move from main to f1.
13. git checkout -b f1 -> it checkouts and creating branch

Note: Main branch is working in production environment so we should not work on main branch and we should create another branch

Q.7 What is git merge?
Ans.It is a Operation that brings the changes of a branch into another branch.
Suoppose we created f1 branch and now need to merge f1 into main.
11. git checkout main -> first we go to main branch from f1 and pointer will also come to active branch which is main now.
12. git merge f1 -> now f1 will get merged into main

Q.8 What is Merge conflict?
Ans. If we are trying to make changes on lines in file in my branch which is already updated in main branch on same line by someone else and now trying to merge my file, there will be conflicts. Now git wil give options to make decisions lilke either neglect both changes from my file or main file or accept both changes following some orders which line should come first.
When we try to merge the chnages from a branch to another branch where there are already some changes which is conflicting with our change, then git will not be able to take decision on how to proceed with merge opertion.
As a developer we have to resolve merge conflicts manuallly.
Ex: Sample.txt of main branch is -
1
2
3
4
5
6
7
8
9
10
Ex: Sample.txt of f1 branch is -
11
22
33
44
5
6
7
8
9
10
Other developer changes main branch sample.txt file as below -
100
200
300
400
5
6
7
8
9
10

Commands we run
git checkout -b f1
git checkout main
git merge f1
Auto-merging Sample.text
CONFLICT (content): Merge conflict in Sample.text
Automatic merge failed; fix conflicts and then commit the result.

and git giving suggestions in sample.txt file of main branch as below
<<<<<<< HEAD
100
200
300
400
=======
11
22
33
44
>>>>>>> f1
5
6
7
8
9
10

Explanation of above suggestions given by git:
<<<<<<< HEAD   --> This means This is current branch and in our code current is master branch and below this, available content is of current branch which is master now.
=======   --> This called only separation
>>>>>>> f1    --> Above this and after separation line, available code is of f1 branch.

Solution: If we want to pick both changes then will just remove HEAD, separation and f1 line as below
100
200
300
400
11
22
33
44
5
6
7
8
9
10

After resolving conflicts from file, we just do git add . and  git commit without message. Once we do git commit, git will open Vim editor and here will pass the message as Merge branch 'f1' into main after resolving conflicts and will save the file.
Note: Whenever we go git merge and git commit, a new node merge commit will be created and merge come from 2 parents we can see in commit id as well as Merge: f8f885f 93f1b37

PS C:\Users\mamkumaw\IdeaProjects\GitDemo> git log
commit cbf4ed384c6306e276277498d6ab0f210e3d37eb (HEAD -> master)
Merge: f8f885f 93f1b37
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 5 12:39:05 2025 +0530

    Merge branch 'f1' into main after resolving conflicts

commit f8f885f5801b91b74e1675440ca5081424c07587
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 5 12:22:07 2025 +0530

    Saving chnages

commit 93f1b37f7b8b7adafc712111683ee12dc395a8f4 (f1)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 5 12:15:29 2025 +0530

    some changes in sample.text file

Q.9 What is Issue with Git merge?
  
Issue with Git Merge is: It does not provide clean git history. It is having commits history like 1 commit from f1 and later 1 commit from master ,It is not having 1 branch commits together, it happens based on timestamp which shows first latest commit then others commits.
2. Whenever we are debugging issue in prod and checking what all are the commits done recently and it shows commits of all the branches in mix. Its difficult to find which commit is causing issue. 
3. We should have clean git history means all the commits from 1 branch should be together while doing git log.
4. This cause happens because of Merge Commit node which having multiple parents node and taking history from them based on timestamp whish is latest.
5. This problem can solved in git merge also in a very special scenario: 
Problem is occurring because of merge commit node if we don't have that node then we can get clean linear git history but this is possible when no commits done in main branch so there merge commit node will be not get created and we get clean linear history of commits. In this scenario no need to do merge but just move main pointer to f1 branch. Now technically we merged both branches. Idea of merge is just bring the changes of a branch into another branch. And we are able to achieve this. This type of merge is called Fast Forward Merge.

Q.10 What is Fast Forward Merge?
Ans. This is very rare when we don't have commits in main branch while we are working on other branch as f1.
if we don't have that node then we can get clean linear git history but this is possible when no commits done in main branch so there merge commit node will be not get created and we get clean linear history of commits. In this scenario no need to do merge but just move main pointer to f1 branch. Now technically we merged both branches. Idea of merge is just bring the changes of a branch into another branch. And we are able to achieve this. This type of merge is called Fast Forward Merge.

Q.11 What is git rebase?
Ans. To get clean git history, we can use Fast Forward Merge  which is very rare and special scenario. There is another approach which is use of git rebase.
Rebase is like changing to a new base. We will change f1 base to main branch then all the commits will be linear.
how to Rebase f1 -> git rebase main
c0 -> c1 -> c2 -> c3 <-- main*
from c3 route we create new branch f1 with commits like below:
c4 -> c5 -> c6  <--- f1*
Now main branch is having more commits like below
c0 -> c1 -> c2 -> c3 -> c6 -> c7 -> c8 <-- main
we can see base of f1 is now c3 means we created f1 branch of tip of c3 commit. Now we will do rebase for f1 and base will change to last commit of main branch.
c0 -> c1 -> c2 -> c3 -> c6 -> c7 -> c8 -> c4 -> c5 -> c6  <--- f1* and main is still on c8 commit --> Here we changed f1 base to latest commit. After just rebase changes means(1. git rebase main ) are not merged into main yet as we can see main is pointing to c8 commit and f1 is pointing to c6 commit. So we have to checkout into main using (2. git checkout main) and do (3. git merge f1). then all the changes of f1 branch will merged into main. Now this merge is called Fast Forward merge because after rebase we don't need to  create merge commit node.
After merging :
c0 -> c1 -> c2 -> c3 -> c6 -> c7 -> c8 -> c4 -> c5 -> c6  <--- f1* and main (both will be on the tip of same commit which is c6.
\Note: Whenever we do rebase, means changes the parent root of f1 branch from c3 to c6 which is incorrect, so git crwate copies of commits like c4', c5',c6' etc bcuase commits can not be updated and older commits will be somwhere in git history. Because history is never forgotten.

Q.12 What is the difference between Direct Merge and Rebase + Merge
Ans. 1. Direct merge: 
Commands:
git checkout main
git merge f1
git add .
git commit


Rebase + Merge : 
git rebase main
git checkout main
git merge f1

2. Direct Merge gives Non Linear git history because commits overlaps from both branches but Rebase + Merge gives clean linear git history.

3. Conflicts happens in both Direct and Rebase, but to avoid conflicts and make it very minimal, we should work on latest code and do rebase frequently in between 2-3 hrs. 

Q.13 What is git remote/git clone/ git getch/ git?
Ans. 
1. remote : It is a  common place from where we download the codebase. we download the codebase in our local, this is called git clone.
2. Clone: It is Downloading the codebase from remote repository to local machine.
Note:
At the remote place we have lot of branches along with main branch. When we do git clone, it downloads entire repository with all the commits history, but cloned codebase is ready only, we can not make changes in downloaded code base as it is available in local, but still we can not update the codebase. It looks like no use of cloned codebase if we can not write code in that cloned codebase.
* It does one more operation that it creates one more copy of default branch or main branch which is read and write copy.

Practical Example:
1. C:\Users\mamkumaw\Desktop>git clone https://github.com/MamtaKu/ProductService.git
Cloning into 'ProductService'...
remote: Enumerating objects: 81, done.
remote: Counting objects: 100% (81/81), done.
remote: Compressing objects: 100% (50/50), done.
remote: Total 81 (delta 16), reused 76 (delta 11), pack-reused 0 (from 0)
Receiving objects: 100% (81/81), 17.24 KiB | 735.00 KiB/s, done.
Resolving deltas: 100% (16/16), done.

2. C:\Users\mamkumaw\Desktop>cd ProductService
3. C:\Users\mamkumaw\Desktop\ProductService>git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master

In Above git branch result, we can see two branches, 1. master and 2.remotes/origin/master
remotes/origin/HEAD -> origin/master  --> HEAD is a pointer which points to the current active branch.

remotes/origin/master -> This is not master branch bit the correct branch name is remotes/origin/master. This is the name of the branch which is available on remote. The branch with this name is Ready only copy.
master -> This is the only master branch. It does not contain remotes/origin. This is Ready Write copy where we can do changes.

If we checkout to this branch remotes/origin/master, we can not make any changes because it is a ready copy only and HEAD will go the detached state.
A detached HEAD is a state in Git where your HEAD (which normally points to the latest commit on your current branch) is pointing directly to a specific commit instead of a branch.

4. C:\Users\mamkumaw\Desktop\ProductService>git checkout remotes/origin/master
Note: switching to 'remotes/origin/master'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at 30a6b95 chnages done
-----------------------------------------------------
What does this mean?

Normally, HEAD points to a branch (e.g., main or develop).
In detached HEAD state, HEAD points to a commit hash.
You can still make changes and commit, but those commits will not belong to any branch unless you create one.

Why is it called detached?
Because HEAD is detached from any branch reference—it’s not tracking a branch.

4. git fetch - Lets say new commit added in remote but these commits will be not available in our cloned codebase. to fetch the latest commits in our local codebase, we have to do git fetch.
It brings all the changes from the remote repository to our local repo. Those changes will be added to the default master branch read only copy.
Now new commits pushed to the remote repo. and we check log in both branch remote/origin/master and master. New commits are not reflecting.

Checking Old commits in remote/origin/master below commands:
5. C:\Users\mamkumaw\Desktop\ProductService>git branch -a
* (HEAD detached at origin/master)
  master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master

6. C:\Users\mamkumaw\Desktop\ProductService>git log
commit 30a6b95679132a3cb7c988a742e2459a0785ef17 (HEAD, origin/master, origin/HEAD, master)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Prodcut Service added

Checking old commits in master branch
-----------------------------------------------------------
7. C:\Users\mamkumaw\Desktop\ProductService>git checkout master
Switched to branch 'master'
Your branch is up to date with 'origin/master'.

8. C:\Users\mamkumaw\Desktop\ProductService>git log
commit 30a6b95679132a3cb7c988a742e2459a0785ef17 (HEAD -> master, origin/master, origin/HEAD)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Prodcut Service added
------------------------------------------------

Note: Till now we have pushed new commits to remote repo but we are not able to changes in local repo. Now irrespective branches we do git fetch origin main.

9. git fetch origin main ->  means here origin is the name of remote. we can give any name to the remote. This command says fetch the changes of main branch
 from origin.
9. C:\Users\mamkumaw\Desktop\ProductService>git fetch origin master
remote: Enumerating objects: 45, done.
remote: Counting objects: 100% (45/45), done.
remote: Compressing objects: 100% (11/11), done.
remote: Total 26 (delta 8), reused 26 (delta 8), pack-reused 0 (from 0)
Unpacking objects: 100% (26/26), 3.41 KiB | 18.00 KiB/s, done.
From https://github.com/MamtaKu/ProductService
 * branch            master     -> FETCH_HEAD
   30a6b95..f29c4e0  master     -> origin/master

Note: Now changes will be added to the remote/origin/master read only copy irrespective of any checkout branch. New commit is "Latest changes done".

checking latest commits is available in master or remote/origin/master
10. C:\Users\mamkumaw\Desktop\ProductService>git branch -a
* (HEAD detached at 30a6b95)
  master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master

checking out to master branch and we see latest commits are there or not after git fetch.
11. C:\Users\mamkumaw\Desktop\ProductService>git checkout master
Switched to branch 'master'
Your branch is behind 'origin/master' by 1 commit, and can be fast-forwarded.
  (use "git pull" to update your local branch)

12. C:\Users\mamkumaw\Desktop\ProductService>git log
commit 30a6b95679132a3cb7c988a742e2459a0785ef17 (HEAD -> master)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Prodcut Service added
-------------------------------------------

checking out to remote/origin/master and we see latest commits are added, after git fetch.
13. C:\Users\mamkumaw\Desktop\ProductService>git checkout remotes/origin/master
Note: switching to 'remotes/origin/master'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at f29c4e0 Latest changes done

14. C:\Users\mamkumaw\Desktop\ProductService>git log
commit f29c4e03934121ede844be3605d188408be10cf5 (HEAD, origin/master, origin/HEAD)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 19 12:59:51 2025 +0530

    Latest changes done

commit 30a6b95679132a3cb7c988a742e2459a0785ef17 (master)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Prodcut Service added
--------------------------------------

Note: git fetch origin master - fetching latest commits into read only copy which is remotes/origin/master. Now changes are not available in master branch. How we can add latest changes in master branch. Now we need to bring changes from one branch(remotes/origin/master) to another branch(master). We have two options either git merge or rebase.

15. we checkout to master and do git merge remotes/origin/master:
16. C:\Users\mamkumaw\Desktop\ProductService>git checkout master
Previous HEAD position was f29c4e0 Latest changes done
Switched to branch 'master'
Your branch is behind 'origin/master' by 1 commit, and can be fast-forwarded.
  (use "git pull" to update your local branch)

17. C:\Users\mamkumaw\Desktop\ProductService>git merge remotes/origin/master
Updating 30a6b95..f29c4e0
Fast-forward
 .../controllers/ProductController.java             |  3 +-
 .../com/demo/productService/models/BaseModel.java  |  3 ++
 .../projections/ProductWithTitleAndPrice.java      |  6 +++
 .../repositories/CategoryRepository.java           | 14 +++++++
 .../repositories/ProductRepositories.java          |  9 -----
 .../repositories/ProductRepository.java            | 41 ++++++++++++++++++++
 .../services/FakeStoreProductService.java          |  2 +-
 .../services/RealDatabaseProductService.java       | 45 +++++++++++++++++++---
 .../ProductServiceApplicationTests.java            | 27 +++++++++++++
 9 files changed, 134 insertions(+), 16 deletions(-)
 create mode 100644 src/main/java/com/demo/productService/projections/ProductWithTitleAndPrice.java
 create mode 100644 src/main/java/com/demo/productService/repositories/CategoryRepository.java
 delete mode 100644 src/main/java/com/demo/productService/repositories/ProductRepositories.java
 create mode 100644 src/main/java/com/demo/productService/repositories/ProductRepository.java


Now we are able to see commit "Latest changes done" in master branch as well.
18. C:\Users\mamkumaw\Desktop\ProductService>git log
commit f29c4e03934121ede844be3605d188408be10cf5 (HEAD -> master, origin/master, origin/HEAD)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 19 12:59:51 2025 +0530

    Latest changes done

commit 30a6b95679132a3cb7c988a742e2459a0785ef17
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Product Service added

Note: To bring changes from remote to read write copy, we use two commands git fetch origin master + git merge remotes/origin/master. We have to run two commands so developer come with solution and created one command which is git pull. git pull is the combination of git fetch + git merge.

19. Now we did new commit as "More latest changes added", we see changes available in master branch which is read write copy using git pull.
20. C:\Users\mamkumaw\Desktop\ProductService>git branch -a
* master
  remotes/origin/HEAD -> origin/master
  remotes/origin/master

21. C:\Users\mamkumaw\Desktop\ProductService>git pull
remote: Enumerating objects: 19, done.
remote: Counting objects: 100% (19/19), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 10 (delta 4), reused 10 (delta 4), pack-reused 0 (from 0)
Unpacking objects: 100% (10/10), 712 bytes | 9.00 KiB/s, done.
From https://github.com/MamtaKu/ProductService
   f29c4e0..daec71a  master     -> origin/master
Updating f29c4e0..daec71a
Fast-forward
 .../com/demo/productService/services/RealDatabaseProductService.java    | 2 ++
 1 file changed, 2 insertions(+)

Now we can see new commit in master branch.
22.C:\Users\mamkumaw\Desktop\ProductService>git log
commit daec71a3f98a1028b5a764fb391a3fab1f0137ed (HEAD -> master, origin/master, origin/HEAD)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 19 13:38:57 2025 +0530

    More latest changes added

commit f29c4e03934121ede844be3605d188408be10cf5
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 19 12:59:51 2025 +0530

    Latest changes done

commit 30a6b95679132a3cb7c988a742e2459a0785ef17
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Prodcut Service added

Now checking new commit in remotes/origin/master as well.
23.C:\Users\mamkumaw\Desktop\ProductService>git checkout remotes/origin/master
Note: switching to 'remotes/origin/master'.

You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.

If you want to create a new branch to retain commits you create, you may
do so (now or later) by using -c with the switch command. Example:

  git switch -c <new-branch-name>

Or undo this operation with:

  git switch -

Turn off this advice by setting config variable advice.detachedHead to false

HEAD is now at daec71a More latest changes added

C:\Users\mamkumaw\Desktop\ProductService>git log
commit daec71a3f98a1028b5a764fb391a3fab1f0137ed (HEAD, origin/master, origin/HEAD, master)
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 19 13:38:57 2025 +0530

    More latest changes added

commit f29c4e03934121ede844be3605d188408be10cf5
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Wed Nov 19 12:59:51 2025 +0530

    Latest changes done

commit 30a6b95679132a3cb7c988a742e2459a0785ef17
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 13:10:20 2025 +0530

    chnages done

commit 3eaeb5d682d3b6cca4048e7cd23fe26b1622da89
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Tue Nov 18 12:09:12 2025 +0530

    code chnages done

commit 6925a504dacb603687f51e3ac25d7b71c076e7ba
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Fri Nov 14 16:20:09 2025 +0530

    saved changes

commit e5457387545d83a3c5329b2d7a7de0d8117df27a
Author: Kumawat <mamta.kumawat@capgemini.com>
Date:   Sat Nov 8 01:02:25 2025 +0530

    Product Service added

Note: commit "More latest changes added" available in both branches.

Q. what is git pull --rebase?
Ans. As we know when we do git merge, there is one disadvantage. It does not give clean commits history. Commits get overlap and we did not get linear history. So we had another approach which is rebase + merge.
Instead of doing git fetch + merge, first git fetch origin master, then git rebase branch_name and then git merge, It will give clen commits history. There is shortcut of this is git pull --rebase.

Q. What is git remote location?
Ans. Git remote location is nothing but any git repository hosting websites. Examples: GitHub/Gitlab/BitBucket

Q. how to push code from local repository to remote repository?
Ans. 1. create new repository on GitHub as newRepo
2. git init
3. git add .
4. git commit -m "first commit"
5. git remote add origin https://github.com/MamtaKu/newRepo.git    ---> It means attaching remote location to my local repo.
6. git remote --> which gives the remote name to which local repo connected.
7. git push -u origin master  -> -u uses when we do first push on remote repo.

Q. what is pull requests(PR)?
Ans. Lets say we want to contribute in open source repository and want to push commits done by me. We need to take permission first from the owner of the open source repo. This is tedious task. 

What else we can do?
1. We can create copy of this open source repository on our git hub and clone this fork repo to local repo and do changes and push back to fork repo.
2. Now we can see fork repo is 1 commit head from original open source repo. So in that case we can raise a pull request. 
3. This pull request will be reviewed by the developer of open source repo owner. If owner likes the changes of pull request,changes can be accepted by owner and we can merge then changes into owner open source repo or can be put comments or can be declined as well. 
4. If any comments owner mentioned we have to work on those changes locally and need to push changes again to our fork repo and again pull request will be raised but this this will be the same pull request will get updated.
5. Now pull request got reviewed and changes accepted.
6. Now this pull request is available to merge and we can confirm merge.
7. Now changes are available to owner's open source repo.


Q.13 what are Project requirements?
Ans. Take an example of Amazon
when we login or sign up into website - Authentication Service will be used
When we search the product - Search Service will be used
When we see the products catalogs - Product Service will be used
When add items into cart - Cart Service will be used
When we place order - Order Service will be used
When we do payment - Payment Service will be used
When we get Notification of order placed -  Notification Service will be used
When Invoice generated, Invoice Service will be used

All above services are used to do one operation which is called Place order.

Q.14 what are microservices & monolithic architecture?
Monolithic Architecture:
1. All the service will be part of the same project and we have only one executable file. We develop entire project and deploy only single executable file.
2. Single code base
3. Easy to build
4. Easy to deploy (all the services in one code base, so will be deployed in one go)
5. When application is very large then deployment becomes difficult and slow down the application as well. And build application time will be more.
6. Development speed also decreases
7. New Technology can be used
8, Scaling can not be done for individual service. We have to scale entire application.


Note: To decide which architecture we use, we have to see our application, how many requests will be there. If its a small application then we can go for Monolithic.

Microservices Architecture : 
1. We separate the service as a module or project and looking individually.
2. Tech stack flexibility - can used different tech stack for services.
3. Selective scaling is possible. 

Q.15 What is  frameworks?
Ans. Ready to use functionalities for most of the common operation of s/w development. Common Operations like creating API's, Writing Test cases, establishing Db connection, Using Kafka, Using cache, Implementing Load balancer, implementing API gateway, Implementing Rate limiting , Implementing Authentication etc. will be provided by framework so we should use it.

Q.16 What is Spring framework?
Ans.
1. It is a java framework which used with java.
2. It is a set of projects that allows us to create enterprise level java application by providing lot of ready to use functionalities.. Enterprise level java application means production level application which is having all the functionalities. Example - Amazon.
3. Spring framework comes with core functionalities and Add Ons like Kafka, Redis, Gateway, Authentication, Database etc.
4. From configuration to security, web apps to big data—whatever the infrastructure needs of your application may be, there is a Spring Project to help you build it. Start small and use just what you need—Spring is modular by design.

Q.17 What are core functionalities of Spring framework?
Ans. 1. IOC(Inversion Of Control)  2. DI(Dependency Injection)

Note: Earlier on Spring framework, Add on Kafka, to work with Kafka , Redis was very difficult task. So developer created one more framework which is called Spring Boot framework, on top of spring framework to get work done in easy way.

Q.18 what is Spring Boot Framework?
Ans, 
1. It provides Spring framework and It provides easy way to configure and add new add ons.
2. No need to write new config files for each dependency.

Q.19 What is dependency Injection?
Ans. When one class is dependent on another class.
class A {
b B;
.
.
}
We can say Class A is dependent on class B. And we have to create the object of B using new keyword. BUt this not a good way to creating objects using new keyword.

Example: All the service having the object of Database.
ProdcutService {
Db db = new Db();
.
.
}

UserService {
Db db = new Db();
.
.
}
CategoryService {
Db db = new Db();
.
.
}
..
many more classes also there which is having the dependency of Database object. We have to create Database object in each class. This is not good way. Creating objects takes part in heap which increases memory and can lead to OutOfMemoryException. Better we should reuse an object. Create a common object of DB & pass it to the class. This is what Dependency Injection says.

If we need to change the common object in future, then if we are creating on object inside every class then we will have to change at all the places. 

We can do Dependency injection via Construction Injection and Setter Injection.
Creating the dependency object in case of 1000 classes, following the right order of object creation. It is very difficult to create  and manage objects manually. This problem solves by InversionOfControl(IOC).

Q.20 What is Inversion Of Control?
Ans. It is a framework doing Dependency Injection on our behalf. We have to provide all the required information like annotations etc. At the time of compilation or at the time of application get initialized, Spring resolve all the dependencies automatically and creates objects of all the dependencies and store somewhere which is called Application Context /Spring Container/Bean Container. Every object is called Bean.

Q.21 What is maven?
Ans. Maven is a build automation and project management tool primarily used for Java-based projects. It was developed by the Apache Software Foundation and helps developers manage a project's build.
In our project we are going to use lot of dependencies\add ons like Kafka, Redis, Authentication, spring cloud, API gateway etc. These dependencies are a separate project and we add these addons in main project as dependencies.
Maven download the dependencies and make available for us.

Q.22 Build an Spring boot project?
Ans. use - start.spring.io
create a spring project
choose project as Maven
Choose Lang as Java
Choose spring boot stable version - 3.5.7
Project Metadata: 
group name : com.scaler  -> we write in reverse
Artifact name : It is a just a project name -> productService
Package name: It is a combination of group name and artifact name. -> com.scaler.productService
Choose Packaging: either Jar or War
Choose Configuration file : Properties or YAML
Choose Java version: 17
Add Dependencies : Initially we can add basic dependencies like Devtools, data jpa, Lombok etc.

Q.23 what is Spring Boot DevTools ?
Ans. It provides fast application restarts, LiveReload etc. When we write code and wanna see the changes we have to build the application manually. But if we use Spring boot DevTools , It will keep on rebuilding out code base.


Q.24 What is Lombok?
Ans. It is a Java annotation library which helps to reduce Boilerplate code. Boiler plate code is The code which is not adding any value to our code. Example when we have 20 attributes in a class and writing getters and setters for all the attribute. We can reduce getters and setters method using @Getter and @Setter annotations. Lombok provides few annotations like getter, setter, toString. 

Q.25 What is Spring Configuration Processor?
Ans. Generate metadata for developers to offer contextual help and "code completion" when working with custom configuration keys (ex.application.properties/.yml files).

Q.26 what is Spring web dependency?
Ans. It Builds web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.

Q.27 what is @RestController?
Ans. This Annotation indicates that this class is a Spring MVC controller. It indicates the Spring that treat this controller as special controller which host Rest HTTP APIs.

Q.28 what is @ResquestMapping?
Ans Whenever any request comes, it maps to a specific controller. Ex if any request come to  /order then it will map to the OrderController.
@RequestMapping("/orders") and /orders is called endpoint.

Example:
@RestController // This annotation indicates that this class is a REST controller
@RequestMapping("/sample")  
public class SampleController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello from SampleController";
    }

    @GetMapping("/goodbye")
    public String sayGoodbye(){
        return "Goodbye from SampleController";
    }
}

Q.29 Why are we writing API's or what happens if we don't write APIs?
Ans. Using API , we can reach out to our functionalities.
If we don't use APIs then we follow below process
If I want to call sayHello(), First will create SampleController object and using this reference we call sayHello Method.
SampleController sampleController = new SampleController();
sayController.sayHello();

Or if we use API then the approach is with the help of spring annotations we can reach out to functionalities.
localhost:  project is going to run on local machine. It means it will point to IP of my machine. Inside my machine many applications are running, All the applications can not run on the same port in server. Otherwise difficult to identify which application is running. We have different ports for each application. Default port is 8080. My application which is available on localhost will run on port number 8080. Now application will reach to specific controller like "/sample" and after controller we want to reach the particular functionality like "/hello"
Our api will we be created like this - localhost:8080/sample/hello
localhost is like domain name as we don't have any domain name like amazon.in or scaler.com etc.

Q.30 what is @PathVariable?
Ans. whenever we write something in {} it becomes API signature. Whatever thing we are passing into API, we have to read inside the method parameter so we can use inside the method.
Using this @PathVariable we can pass the variables inside the API. there are multiple ways of passing variables inside the API. one @Pathvariable
In Spring Boot (or generally in Spring MVC), @PathVariable is an annotation used to extract values from the URI path of a request and bind them to method parameters in a controller.

Ex; @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello from SampleController";
    }

There are multiple ways to bind API data to method parameters.
1. @PathVriable :
Purpose: Binds a URI template variable to a method parameter.
Example: /users/{id} → @PathVariable Long id

Example: 
@GetMapping("/hello/{name}/{age}")
    public String sayHello(@PathVariable("name") String name,
                           @PathVariable("age") int age){
        return "Hello " + name + ": This is your age " + age ;
    }

Endpoint : http://localhost:8080/sample/hello/mamta/29

2. @RequestParam :
Purpose: Binds query parameters from the URL.
Example: /users?id=42 → @RequestParam Long id

Example:
@GetMapping("/hello")
public ResponseEntity<String> searchUsers(@RequestParam String name, @RequestParam int age) {
    return ResponseEntity.ok("Searching for user: " + name + ", Age: " + age);
}

How to pass query parameters : You can pass query parameters in several ways depending on the context (browser, Postman, frontend code, etc.).
1. Via Browser URL
To pass query parameters in a URL when calling a Spring Boot endpoint, you simply append them to the URL after a ? symbol. 
http://localhost:8080/search?name=Mamta&age=30

2. Via Postman
Select GET method.
Enter the base URL: http://localhost:8080/search
Click the Params tab.
Add key-value pairs:

name → Mamta
age → 30


Postman will automatically append them to the URL.

Q.31 how to check logs locally? 
Ans, Whenever we are hitting api and if something goes wrong we should get exceptions. How we can see those exceptions. We have to enable the logs. We can define properties in application.properties.
logging.level.com.demo.productService.controllers=DEBUG
logging.level.packagename=DEBUG

when we hit this api - http://localhost:8080/sample/hello/mamta/mini  ---instead of age if we pas String parameter
Resolved [org.springframework.web.method.annotation.MethodArgumentTypeMismatchException: Method parameter 'age': Failed to convert value of type 'java.lang.String' to required type 'int'; For input string: "mini"]

Q.32 What is Spring MVC?
Ans. MVS stand for Model, View and Controller. We use Model and Controller. View is related to UI. All the request comes to Controller. Controller call to Business logic layer which is Service layer. Service layer connect to database through Repository class to avoid tight coupling. and follow back from database to till controller.
It is design pattern or way to structurise our APIs.

Q.33 What is DTO?
Ans. DTO stands for Data Transfer Object. Objects which are going to use transfer the data. We trying to hide data from user. When we have lot of data about any entity  in database and User doesn't want to se all these attributes. Transferring data from user to use, we pas DTO. DTOs are nothing but wrapper classes which we can create depending our use case and inside the DTO we can create the variables which are absolutely required in order to show the user.
All the tables are called Model. Model is nothing but an entity.
DTOs are used for client interactions. DTOs are used between client and controller.
DTOs are not passed in @PathVariable. DTO's are passed in Request parameters. 
DAOs stands for Data Access Object. Objects which are used to access databases. Repositories are called DAOs. WE can call Product Depository as Product DAO.

Q,34 what is Journey of a request in Spring framework?
Ans. When call localhost:8080/sample  -Localhost is our operating system call. It means Operating system will identify that localhost means IP address of my system. It will make a call to my laptop on given port number 8080. After request comes to port number, Servlet comes into picture. This dispatcher servlet called Dispatcher servlet. This is the starting pint of out spring application. What it does? It takes request endpoint which is /sample and makes call to another component which is called Handler Mapping. This is a simple which maintains the mapping between request endpoint and controller. If any request coming to /sample, the request should go to SampleController. @RequestMapping which we use on top of our controller class. It creates mapping in Handler Mapping class. Basically It takes endpoint from dispatcher servlet and does mapping and return specific controller to the Dispatcher servlet. After receiving controller, Dispatcher servlet makes a request to controller. Now Controller accepts endpoint for the method or functionality which is written in our api after /sample. Lets assume api is localhost:8080/sample/sayHello. So controller takes request of /sayHello. and controller does mapping with respective methods with the help of method type mapping like GetMapping, PostMapping etc. Controller gives response back to dispatcher servlet and it return response to the client.

Brief:
API request is received by Dispatcher Servlet.
Servlet asks Handler Mapping to get the right controller.

Q.35 what is REST?
Ans. REST -> ReST -> Representational State Transfer
REST are the principles which we should follow around the APIs. REST are the guidelines about how we should write our APIs.

Rule 1: All the APIs should be structured around the resource.
Ex: /video/upload --> we mentioned operation as upload in API design
/users/create --> we mentioned operation as create in AP design

Above examples are not right way to design API but its correct and looks more readable.

But if we follow 100% REST principles, means APIs should be structured around the resource. WE should use only /videos or /users but 

Rule 2:
the problem is how we can differentiate action type like create, update, read and delete. 
REST says The type of action for an API should be defined by Http method and it should not be part of API endpoint.

Rule 3: REST APIs should be stateless means 
1. the current request should not be dependent any of the previous request.
what is stateful request? When client request goes to only same server. 
2. Every request should be self sufficient
3. Every request should contain all the data that it needs to execute.
4. Stateless servers are scalable.
5. REST says avoid chatty APIs as much as possible.
6. No restrictions on the data type of response like XML, JSON, Protobuf. JSON is most widely used as its very simple as English in reading.

Q.36 What is Postman?
Ans. Postman is a popular API development and testing tool used by developers to interact with RESTful APIs. It provides a user-friendly interface to send HTTP requests and view responses, making it easier to test and debug APIs.

Key Features of Postman:
1. Send HTTP Requests:
Supports GET, POST, PUT, DELETE, PATCH, etc.
You can add headers, query parameters, body data, and authentication.

2. View Responses:
Shows status codes, response time, headers, and body.
Supports JSON, XML, HTML, and plain text formats.

Q.37 what are the HTTP methods?
Ans.
1. Get: fetch a resource from backend.
2. Post: Creating a resource on the server.
3. Patch: Update some attributes of a resource on server. It is a partial update. No need to pass all the attributes in the json. We do update via request body and pass the attributes which we want to update and remaining will be unchanged.
4. Put: Replace the entire object. We ned to pass all the attributes to json , if we miss attributes in request body, those value will be set to null.
5. Delete: Delete the resource from server.

Q.38 What is chatty API's?
Ans. These APIs don't returning all the related date in one go. In this Client will have to make multiple API calls to get all the data.
Ex We have User table which is having all th common info of all the users and we have separate table for Mentor which is having additional data of mentor.
Users
id | name | email | phone no.

Mentor
user_id | avgRating | No.Of classes

To get all info of mentor, we have to call to APIs. 
1. GET \users\10   --- will give users table info
2. GET \mentor\10 --- wil give mentor info 

Note:when we have dpendency in our class, Spring resolve first dependency, if dependency is having any annotation then only spring will create the bean. Spring will check on comilation time.

Q.39 what is RestTemplate?
Ans. In Spring (a popular Java framework), RestTemplate is a class used to make HTTP requests/calls to RESTful web services.
RestTemplate is part of the Spring Web module and acts as a synchronous client to perform HTTP requests like:
GET
POST
PUT
DELETE
No use to create multiple copies of RestTemplate. So we craete at one place and use it. Snd that one place is in our Configuration class.

Common Uses of RestTemplate:
1. Fetching data from an API:
 public Product getSingleProduct(Long productId) {

        ResponseEntity<FakeStoreProductDto> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);
        FakeStoreProductDto fakeStoreProductDto = forEntity.getBody();
        if(fakeStoreProductDto == null){
            return null;
        }
        return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);

    }


Explaination: we use getForEntity("url", type of the response)

whenever we call an api, it returns json object. We have to capture that api response in some object. So that object type we have to pass as parameter in getForEntity method. So deserialization happens here. APi response which is in json format will be converted into object so this process sis called serialization. When we make a request means mapping happens from java object to json, this is called serialization.

Example:

ResponseEntity<FakeStoreProductDto> forEntity =
    restTemplate.getForEntity("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);

1. RestTemplate.getForEntity() makes an HTTP GET request to the given URL.
2. The API returns a JSON response (e.g., from FakeStore API).
3. Spring uses HttpMessageConverters (by default MappingJackson2HttpMessageConverter) to:
In Spring, HTTP Message Converters are the components responsible for serializing and deserializing data between Java objects and HTTP request/response bodies.They are part of Spring MVC and RestTemplate.
They automatically convert:

Java object → HTTP body (Serialization)
HTTP body → Java object (Deserialization)

Deserialize JSON → Java object (FakeStoreProductDto).
If you were sending data (POST), it would serialize Java object → JSON.

Deserialization Process:
1. FakeStore API returns JSON like:
{
  "id": 1,
  "title": "Fjallraven Backpack",
  "price": 109.95,
  "description": "Your perfect pack for everyday use",
  "category": "men's clothing",
  "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg"
}
2. RestTemplate sees FakeStoreProductDto.class and uses Jackson to map JSON keys to fields in your DTO:

private Long id;
private String title;
private Double price;
private String description;
private String category;
private String image; // matches JSON key

3. Jackson uses reflection and getters/setters (or Lombok-generated ones) to populate the object.

Serialization Process (for POST):
Serialization means converting a Java object into a format suitable for transmission over HTTP, usually JSON.
Example:
restTemplate.postForEntity("https://fakestoreapi.com/products", dto, FakeStoreProductDto.class);

Step-by-Step Process:

1. You pass dto (Java object) as the request body.
2. Spring checks the Content-Type header (usually application/json).
3. Spring uses HttpMessageConverters (specifically MappingJackson2HttpMessageConverter) to:
Convert the Java object (FakeStoreProductDto) → JSON string.
Example JSON sent:
{
  "title": "Wireless Headphones",
  "price": 129.99,
  "description": "High-quality Bluetooth headphones",
  "category": "Electronics",
  "image": "https://example.com/image.jpg"
}
4. This JSON is placed in the HTTP request body and sent to the API.
5. The API processes the JSON and returns a response (usually JSON).
6. Spring deserializes the response JSON back into a Java object (FakeStoreProductDto) using the same converter.

2. Fetching All data from an API(GET):
public List<Product> getAllProducts() {
        ResponseEntity<FakeStoreProductDto[]> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products", FakeStoreProductDto[].class);
List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto : forEntity.getBody()){
            products.add(convertFaleStorePrductDtoToProduct(fakeStoreProductDto));
        }
        return products;
}

2. Sending data to an API (POST):


@Override
public Product createProduct(Product product) {
    // 1. Convert Product (your internal model) to FakeStoreProductDto (API model)
    FakeStoreProductDto fakeStoreProductDto = convertProductToFakeStoreProductDto(product);

    // 2. Make a POST request to FakeStore API with the DTO
    ResponseEntity<FakeStoreProductDto> forEntity =
        restTemplate.postForEntity("https://fakestoreapi.com/products",
                                   fakeStoreProductDto,
                                   FakeStoreProductDto.class);

    // 3. Get the response body (created product from API)
    FakeStoreProductDto createdFakeStoreProductDto = forEntity.getBody();

    // 4. Convert API response back to your internal Product model
    if (createdFakeStoreProductDto != null) {
        return convertFaleStorePrductDtoToProduct(createdFakeStoreProductDto);
    }

    // 5. If response is null, return null
    return null;
}

What’s Happening Behind the Scenes


1. Serialization

fakeStoreProductDto (Java object) → JSON using MappingJackson2HttpMessageConverter.
Sent in the HTTP request body to https://fakestoreapi.com/products.

2. HTTP POST Request

RestTemplate.postForEntity() sends the JSON payload.
Sets Content-Type: application/json.

3. Deserialization

API responds with JSON (created product details).
Spring converts JSON → FakeStoreProductDto using Jackson.

4. Conversion

You convert FakeStoreProductDto → Product (your internal model) for consistency.

3. Replacing data (PUT):
@Override
    public Product replaceProduct(Long productId, Product product) {
        FakeStoreProductDto fakeStoreProductDto = convertProductToFakeStoreProductDto(product);
        restTemplate.put("https://fakestoreapi.com/products/"+ productId, fakeStoreProductDto);
            return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);
    }

You convert your internal Product to FakeStoreProductDto.
You call restTemplate.put() to update the product on Fake Store API.
Then you convert the same DTO back to Product and return it.

Problem

restTemplate.put() does not return the updated object from the API.
So the returned Product is not the actual updated object from Fake Store API, it’s just the same object you sent.

we can use exchange() instead of put to get the response.
Signature:
<T> ResponseEntity<T> exchange(
    String url,
    HttpMethod method,
    HttpEntity<?> requestEntity,
    Class<T> responseType
)

restTemplate.exchange("https://fakestoreapi.com/products/"+ productId, HttpMethod.PUT, new HttpEntity<>(fakeStoreProductDto), FakeStoreProductDto.class);
exchange() sends the PUT request and returns the updated object from the API.

Parameters

1. url → The endpoint you want to call.
2. method → HTTP method (GET, POST, PUT, PATCH, DELETE).
3. requestEntity → Wraps your request body and headers (HttpEntity).
4. responseType → The type of object you expect in the response

4. Updating Data (Patch):

 public Product updateProduct(Long productId,  Map<String, Object> updates) {

        ResponseEntity<FakeStoreProductDto> exchange = restTemplate.exchange("https://fakestoreapi.com/products/" + productId, HttpMethod.PATCH, new HttpEntity<>(updates), FakeStoreProductDto.class);
        FakeStoreProductDto body = exchange.getBody();
        if(body == null){
            return null;
        }
        return convertFaleStorePrductDtoToProduct(body);
}

RestTemplate does not have a built-in patch() method. The available convenience methods are:

getForObject()
postForObject()
put()
delete()

For PATCH, you must use the more generic exchange() method with HttpMethod.PATCH.

5. Deleting the data(DELETE):
 public void deleteProduct(Long productId) {
        restTemplate.delete("https://fakestoreapi.com/products/" + productId);
    }

Sends an HTTP DELETE request.
Does not return any response body (it’s void).
If you need status or headers, use exchange().

Complete code for all API:
------------------------------------------
@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate createRestTemplateBean(){
        return new RestTemplate();
    }

}
--------------------------------------------
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @GetMapping("{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){
        return productService.getSingleProduct(productId);

    }

    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();

    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);

    }

    @PutMapping("{productId}")
    public Product replaceProduct(@PathVariable("productId") Long productId, @RequestBody Product product){
        return productService.replaceProduct(productId, product);
    }

    @DeleteMapping("{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId){
        productService.deleteProduct(productId);
    }

    @PatchMapping("{productId}")
    public Product updateProduct(@PathVariable("productId") Long productId, @RequestBody Map<String, Object> updates){
       return productService.updateProduct(productId, updates);
    }

}
----------------------------------------------
public class FakeStoreProductDto {
    private Long id;
    private String title;
    private Double price;
    private String description;
    private String category;
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
------------------------------------------------------------------
public class Product extends BaseModel {
    private String title;
    private Double price;
    private String description;
    private Category category;
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
----------------------------------------------------------
public class Category extends BaseModel {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
---------------------------------------------------------------
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date updatedAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
----------------------------------------------------------------------------
public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product replaceProduct(Long productId, Product product);
    void deleteProduct(Long productId);
    Product updateProduct(Long productId,  Map<String, Object> updates);
}
----------------------------------------------------------------------------
@Service
public class FakeStoreProductService implements ProductService {

    private final RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
    @Override
    public Product getSingleProduct(Long productId) {

        ResponseEntity<FakeStoreProductDto> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);
        FakeStoreProductDto fakeStoreProductDto = forEntity.getBody();
        if(fakeStoreProductDto == null){
            return null;
        }
        return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);

    }

    private Product convertFaleStorePrductDtoToProduct(FakeStoreProductDto fakeStoreProductDto){
        Product product = new Product();
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.setImageUrl(fakeStoreProductDto.getImageUrl());
        product.setId(fakeStoreProductDto.getId());

        Category category = new Category();
        category.setName(fakeStoreProductDto.getCategory());
        product.setCategory(category);
        return product;

    }

    public FakeStoreProductDto convertProductToFakeStoreProductDto(Product product){
        FakeStoreProductDto fakeStoreProductDto = new FakeStoreProductDto();
        fakeStoreProductDto.setTitle(product.getTitle());
        fakeStoreProductDto.setDescription(product.getDescription());
        fakeStoreProductDto.setPrice(product.getPrice());
        fakeStoreProductDto.setImageUrl(product.getImageUrl());
        if(product.getCategory() != null) {
            fakeStoreProductDto.setCategory(product.getCategory().getName());
        }
        return fakeStoreProductDto;
    }

    @Override
    public List<Product> getAllProducts() {
        ResponseEntity<FakeStoreProductDto[]> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products", FakeStoreProductDto[].class);
//        FakeStoreProductDto[] fakeStoreProductDtos = forEntity.getBody();
//        if(fakeStoreProductDtos != null){
//            return  List.of(fakeStoreProductDtos).stream()
//                    .map(this::convertFaleStorePrductDtoToProduct)
//                    .toList();
//        }

        List<Product> products = new ArrayList<>();
        for(FakeStoreProductDto fakeStoreProductDto : forEntity.getBody()){
            products.add(convertFaleStorePrductDtoToProduct(fakeStoreProductDto));
        }
        return products;

    }

    @Override
    public Product createProduct(Product product) {
        FakeStoreProductDto fakeStoreProductDto = convertProductToFakeStoreProductDto(product);
        ResponseEntity<FakeStoreProductDto> forEntity = restTemplate.postForEntity("https://fakestoreapi.com/products", fakeStoreProductDto, FakeStoreProductDto.class);
        FakeStoreProductDto createdFakeStoreProductDto = forEntity.getBody();
        return convertFaleStorePrductDtoToProduct(createdFakeStoreProductDto);

    }

    @Override
    public Product replaceProduct(Long productId, Product product) {
        FakeStoreProductDto fakeStoreProductDto = convertProductToFakeStoreProductDto(product);
        //restTemplate.put("https://fakestoreapi.com/products/"+ productId, fakeStoreProductDto);
        restTemplate.exchange("https://fakestoreapi.com/products/"+ productId, HttpMethod.PUT, new HttpEntity<>(fakeStoreProductDto), FakeStoreProductDto.class);
        return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);
    }

    @Override
    public void deleteProduct(Long productId) {
        restTemplate.delete("https://fakestoreapi.com/products/" + productId);
    }

    public Product updateProduct(Long productId,  Map<String, Object> updates) {

        ResponseEntity<FakeStoreProductDto> exchange = restTemplate.exchange("https://fakestoreapi.com/products/" + productId, HttpMethod.PATCH, new HttpEntity<>(updates), FakeStoreProductDto.class);
        FakeStoreProductDto body = exchange.getBody();
        if(body == null){
            return null;
        }
        return convertFaleStorePrductDtoToProduct(body);


//        // Fetch the existing product
//        Product existingProduct = getSingleProduct(productId);
//        if (existingProduct == null) {
//            return null;
//        }

        // Apply updates
//        updates.forEach((key, value) -> {
//            switch (key) {
//                case "title" -> existingProduct.setTitle((String) value);
//                case "price" -> existingProduct.setPrice(Double.valueOf(value.toString()));
//                case "description" -> existingProduct.setDescription((String) value);
//                case "imageUrl" -> existingProduct.setImageUrl((String) value);
//                case "category" -> {
//                    Category category = new Category();
//                    category.setName((String) value);
//                    existingProduct.setCategory(category);
//                }
//            }
//        });

        // Replace the product with updated values
//        return replaceProduct(productId, existingProduct);
    }

}

Q.40 Example of @Configuration and @Bean?
Ans.
@Configuration
public class AppConfiguration {

    @Bean
    public RestTemplate createRestTemplateBean(){
        return new RestTemplate();
    }

}

Q.41 why we can not take response type as list?
Ans. You can take the response type as a List, but not directly with getForEntity() because:
Why getForEntity() Doesn’t Work with List

RestTemplate.getForEntity(url, FakeStoreProductDto.class) expects a single object type, not a generic type like List<FakeStoreProductDto>.

Java’s type erasure removes generic type information at runtime, so Spring cannot infer List<FakeStoreProductDto> automatically. So List<FakeStoreProductDto> becomes just List at runtime.

restTemplate.getForEntity(url, List<FakeStoreProductDto>.class);
This is invalid because List<FakeStoreProductDto>.class does not exist (due to type erasure).
Only List.class exists, which gives no info about element type. API runs at run time and List parameters will be removed at run time. Instead of using we can use Array as below code:
ResponseEntity<FakeStoreProductDto[]> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products", FakeStoreProductDto[].class);
        



Q.42 What is Java's Type Erasure?
Ans. Java generics exist only at compile time.
At runtime, the JVM removes generic type information (this is called type erasure).
Java Generics came into picture in Java 1.5. Earlier we use to add elements in list as :
List l = new ArrayList();
l.add(10);
l.add("Scaler");
l.add(new Student());

Above way is not providing compile type safety.

Later java 1.5, Generics came which was giving compile type safety as below:
List<Student> l = new ArrayList<>();
l.add(10); --> it will throw error at compile time itself.

Note: Java is a Backward Compatible Language. Backward compatibility means new versions of Java do not break existing code written in older versions. We also support  all previous till java 1.5 versions. To support that Java's Type Erasure came up.
Type Erasure : Generics are parameterized datatype, is only required for compile time safety and can be removed at run time. At run time, remove the parameterized datatype so that older code also works.

Q.43 About Exception Handling?
Ans. we have flow like request goes from  client -> Controller -> Service -> Repository -> Database and response comes from Database -> Service -> Controller ->  client.
Exception can happen at any layer. Whenever exception happens there are two ways to handle it, either handle it(using try, catch) or pass it(using throws).
catch means handling the exception and throw means passing to caller method.

When Repository throws exception then either Repository can handle the exception or can pass to caller and caller is Service. If Repository is passing exception to Service the Service either handle or throw to caller and now caller is Controller. Controller can handle or throw to the user/client.
Example:
@GetMapping("{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){
        throw new RuntimeException("Something went wrong");
}

GET  http://localhost:8080/products/1  ->Controller is throwing error directlty to the client and client can see all the information about classes and all. See below error message which got on browser.

Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Fri Nov 14 02:21:00 IST 2025
There was an unexpected error (type=Internal Server Error, status=500).
Something went wrong
java.lang.RuntimeException: Something went wrong
	at com.demo.productService.controllers.ProductController.getSingleProduct(ProductController.java:26)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
.
.
.
.

Note: Above error is very bad user experience and we are exposing too many details to the user.

Lets say Service class is throwing the error.
Service class:
public Product getSingleProduct(Long productId) {
throw new RuntimeException("Something vaste");
}

Controller class:
@GetMapping("{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){
        return productService.getSingleProduct(productId);


GET  http://localhost:8080/products/1  ->Sevice is throwing error and controller is not handling it. Controller is throwing error directly to the client and client can see all the information about classes and all. See below error message which got on browser.

Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Fri Nov 14 02:32:22 IST 2025
There was an unexpected error (type=Internal Server Error, status=500).
Something vaste
java.lang.RuntimeException: Something vaste
	at com.demo.productService.services.FakeStoreProductService.getSingleProduct(FakeStoreProductService.java:32)
	at com.demo.productService.controllers.ProductController.getSingleProduct(ProductController.java:26)
	at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)

Note: we are able to see all the classes details that is not good and can raise security issues. We should not throw exception directly to the client and we showonly relevant message to the client.

How to fix it:
 @GetMapping("{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId){
        try{
            Product product = productService.getSingleProduct(productId);
            return new ResponseEntity<>(product, HttpStatus.OK);

        } catch(RuntimeException e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

Note: we should try to handle exceptions at controller as service, repo classes keep on throwing errors. But again code increases means classes increases and we handle exceptions at controller level. It will be not good idea. But we can handle at controller in small applications.
We should pass relevant error code to the client instead entire stack of classes. Which can help in UI designs which will be displayed to the client.
We have many http status code. To attach code with body/response, we can use Response Entity class.

Q.44 What is Response Entity?
Ans. ResponseEntity is a class in Spring that represents the entire HTTP response, not just the body. It gives you full control over:
1. Status Code (e.g., 200 OK, 404 Not Found)
2. Headers (e.g., Content-Type, Authorization)
3. Body (the actual data you want to return)

Structure:

public class ResponseEntity<T> {
    private HttpStatus status;
    private HttpHeaders headers;
    private T body;
}
T → Type of the response body (e.g., Product, String, DTO).

@GetMapping("{productId}")
    public ResponseEntity<Product> getSingleProduct(@PathVariable("productId") Long productId){
        try{
            Product product = productService.getSingleProduct(productId);
            return new ResponseEntity<>(product, HttpStatus.OK);

        } catch(RuntimeException e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


Q.45 What are HTTP status code?
Ans. HTTP status codes are standard response codes defined by the HTTP protocol to indicate the result of a client’s request to a server. They tell you whether the request was successful, failed, or needs further action.

Categories of HTTP Status Codes
1. 1xx – Informational

Request received, continuing process.
Example: 100 Continue
Scenario: Client sends a large file upload. Server responds with 100 Continue to tell the client: “Go ahead, I’m ready to receive the rest.”

2. 2xx – Success

The request was successfully processed.
Examples:

200 OK → Request succeeded.
Scenario: You call GET /products/1 and the product exists. Server returns the product with 200 OK.

201 Created → Resource created (e.g., after POST).
Scenario: You send POST /products with new product data. Server creates the product and returns 201 Created with the new resource.

204 No Content → Success but no body returned (e.g., after DELETE).
Scenario: You call DELETE /products/1. Server deletes the product and returns 204 No Content because there’s nothing to return.

3. 3xx – Redirection

Further action needed (redirect).
Examples:

301 Moved Permanently
Scenario: Old API endpoint /v1/products is replaced by /v2/products. Server sends 301 to redirect clients.

302 Found
Scenario: After login, server redirects you to the dashboard page.

4. 4xx – Client Errors

The request is invalid or cannot be processed.
Examples:

400 Bad Request → Invalid syntax.
Scenario: You send POST /products without required fields (e.g., missing title). Server says request is invalid.

401 Unauthorized → Authentication required.
Scenario: You call GET /orders without a valid token. Server responds with 401.

403 Forbidden → Access denied.
Scenario: You try to delete a product but your role doesn’t allow it. Server responds with 403.

404 Not Found → Resource not found.
Scenario: You call GET /products/999 but product doesn’t exist. Server responds with 404.

5. 5xx – Server Errors

The server failed to fulfill a valid request.
Examples:

500 Internal Server Error/Your server itself failed.
Scenario: Server crashes while processing your request

502 Bad Gateway
Your request reached a server, but that server depends on another server to fulfill the request. The second server responded incorrectly or not at all.
our microservice calls another microservice that is offline or misconfigured.

503 Service Unavailable
Scenario: API is down for maintenance. Server responds with 503.


Q.46 what is Controller Advice?
Ans. If we keep on handling exceptions on controller, Controller will become too bulky. Ideally controller should be very light as it takes request and gives response to the client. Now the concept of Controller Advice comes here. 
Controller is the final thing from exceptions come to the client. But Spring provides additional check between client and controller. Every response which passes by controller to client, which goes via a special component which is called Controller Advice. We can do any modification, changes in Reponses which comes from controller.

Controller advice is an additional check on the response that is being returned by controller to the client. We can use Controller advice as a Global Exception Handler. There are many Controller Advices but most used is Global Exception Handler. There are many use of Controller advise but most usd one is Global Exception hander.

Q.47 What is Global Exception Handler?
Ans. If we have many controllers and throwing same exception in that case we have to handle in all controllers means we are duplicating the codes at n places But with the help f global Exception handler, we an handle at one place only.
We can give any name to this class as GlobalExceptionHandler, ProductServiceExceptionHandler etc. and annotate class with @ControllerAdvice which tell to spring that there is Controller Advice. Spring understands only Annotations so it is mandatory to annotate the class.

and we write handler methods which handles the exceptions. we use @ExceptionHandler on top of each method and pass the exception type.
Case 1:
Example: Service class is throwing runtime exception and Controller is calling to service class but Controller is not handling the exception. it will be handled via ControllerAdvice.
----------------------------------------------------
@ControllerAdvice
public class ProductServiceExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<Void> handleRunTimeException(){
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
}

---------------------------------------------------------
@GetMapping("{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){
        return productService.getSingleProduct(productId);
    }
--------------------------------------------------------------

 public Product getSingleProduct(Long productId) {

        ResponseEntity<FakeStoreProductDto> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);
        FakeStoreProductDto fakeStoreProductDto = forEntity.getBody();
        if(fakeStoreProductDto == null){
            throw new RuntimeException("Exception occured");
        }

        return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);

    }

When we hit the api http://localhost:8080/products/100---we can see proper message on the browser.

if we throw RuntimeException from another Controller, Controller Advice will handle it as well.

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @GetMapping("/{id}")
    public Category getSingleCategory(@PathVariable Long id){
        throw new RuntimeException("Something went wrong");
    }
}

Case 2:
Note: When Global Exception handler handles RuntimeExceptions, automatically it handles its child as well. Ex; NullPointerException is a type of RuntimeException, if controller class throws NullPOinterException, in that case RuntimeException will be triggered and handled.

We can handle null pointer exception with passing proper message to client in case we pass wrong productid.
-----------------------------------------------------------------
 @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<String> handleBNullPointerException(){
        return new ResponseEntity<>("Please try again with valid product id", HttpStatus.NOT_FOUND);
    }
-----------------------------------------------------------------
@GetMapping("{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId){
        return productService.getSingleProduct(productId);
    }
-----------------------------------------------------------------
public Product getSingleProduct(Long productId) {

        ResponseEntity<FakeStoreProductDto> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);
        FakeStoreProductDto fakeStoreProductDto = forEntity.getBody();
        if(fakeStoreProductDto == null){
            System.out.println("DEBUG");
        }
        return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);
    }
----------
when we pass wrong product id 100 which is not exist, so we can show proper message like below
GET  localhost:8080/products/100
Response: with 404 NOT Found
Please try again with valid product id  

Case 3:We can not modify the NUll pointerException as its in built. We can use Custom exceptions where we can show productid which is passed wrong in url.
------------------------------------------------
  @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleProductNotFoundException(ProductNotFoundException productNotFoundException){
        return new ResponseEntity<>("This is invalid productId " + productNotFoundException.getProductId() + " please provide the valid product id", HttpStatus.NOT_FOUND);
    }
--------------------------------------------------
 @GetMapping("{productId}")
    public Product getSingleProduct(@PathVariable("productId") Long productId) throws ProductNotFoundException {
        return productService.getSingleProduct(productId);
    }
-------------------------------------------------------------------
public class ProductNotFoundException extends Exception {
    private Long productId;
    public ProductNotFoundException(Long productId){
        this.productId = productId;
    }
    public ProductNotFoundException(String s){
        super(s);
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
}
--------------------------------------------------------------------
  public Product getSingleProduct(Long productId) throws ProductNotFoundException {

        ResponseEntity<FakeStoreProductDto> forEntity = restTemplate.getForEntity("https://fakestoreapi.com/products/" + productId, FakeStoreProductDto.class);
        FakeStoreProductDto fakeStoreProductDto = forEntity.getBody();
        if(fakeStoreProductDto == null){
            throw new ProductNotFoundException(productId);
        }
        return convertFaleStorePrductDtoToProduct(fakeStoreProductDto);
    }

---------------------------------
GET localhost:8080/products/100 --> 
Response ;
This is invalid productId 100 please provide the valid product id

Q.48 What are key features of Controller advice?
Ans. Controller Advice is a concept in Spring Framework (specifically Spring MVC) used to handle cross-cutting concerns for controllers in a centralized way. It is implemented using the @ControllerAdvice annotation.

what are cross cutting concerns?
In software architecture, cross-cutting concerns are aspects of a program that affect multiple layers or components of an application. They are not tied to a single module but are needed across different parts of the system.

Examples of Cross-Cutting Concerns:
Logging – You need logs in controllers, services, repositories.
Exception Handling – Every controller needs consistent error handling.
Security – Authentication and authorization checks across multiple endpoints.
Validation – Input validation for different controllers.

Why are they called "cross-cutting"?
Because these concerns cut across the main business logic of your application. Instead of duplicating code in every controller or service, you centralize them using techniques like AOP (Aspect-Oriented Programming) or annotations like @ControllerAdvice.

In Spring MVC
@ControllerAdvice helps handle cross-cutting concerns for controllers, such as:
Apply global exception handling.
Bind global data to all controllers.
Apply global model attributes.
Data binding rules

Key Features:
1. Global Exception Handling:
You can define methods annotated with @ExceptionHandler inside a @ControllerAdvice class to handle exceptions thrown by any controller.
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Something went wrong: " + ex.getMessage());
    }
}

2. Global Model Attributes
You can add attributes to the model for all controllers using @ModelAttribute inside @ControllerAdvice.

@ControllerAdvice
public class GlobalModelAttributes {

    @ModelAttribute
    public void addGlobalAttributes(Model model) {
        model.addAttribute("appName", "My Spring App");
        model.addAttribute("version", "1.0");
    }
}
How it works:

Every controller will automatically have appName and version in its model.

3. Global Data Binding

You can customize data binding for all controllers using @InitBinder.

4. Scoped Controller Advice
You can limit the advice to specific controllers using basePackages or assignableTypes.
@ControllerAdvice(basePackages = "com.example.controllers")
public class ScopedControllerAdvice {
    // Applies only to controllers in com.example.controllers package
}

Q.48 What is Difference Between @ControllerAdvice and @RestControllerAdvice ?
Ans.
@ControllerAdvice works for MVC controllers (returns views).
@RestControllerAdvice is a combination of @ControllerAdvice + @ResponseBody (returns JSON/XML responses).


Q.49 what is ORM ad why it came in picture?
Ans. Operations we do on database is:
Integrating database with our application:
Before doing CRUD operations, we need database, to get Database , first we need to design the schema.
There is a strong relationship between Class diagram and schema design. For the classes, we have respective table in database.

Flow we follow:
first class diagrams -> Schema designs ->  creating tables - > Relationship between entities -> Now able to do CRUD operations on database.

lets assume schema designs done. Now need to create tables and need to write lot of queries like create table, establish all the r1q2ela12tionships like primary key, foreign key, apply constraints on column should be unique, which should be not null etc.
Every developer is doing the same task of creating table, updating table. All are following the common way of doing all these. There is a concept which allows us to do database operations in a very easy way. We know that class Diagram and Schema design has strong corelation. If already we have spent times on class diagram, do we really need to spend time on schema design. This concept called as ORM (Object Relational Mapping). Object means class and Relational means table. 
What ORM library does? 
It tries to create mapping between class and the corresponding table. ORM says that focus on creation of class diagram and follow some steps, Table creation things will be done by ORM. ORM reduce the duplicate efforts like creating tables for multiple classes follow the same process.
ORM automatically creates tables for us. ORM provides easy way to work with database. ORM can provide queries to create table, update constraints and automatic creates relationships.
Most popular ORM is hibernate. There are many ORMs like MyBatis, Jooq etc.
We use Hibernate ORM as this is default using ORM with SpringBoot.
To establisg the HIbernate with our service, we have to make connection between them. We add dependency of Hibernate. If we do this ,means service and hibernate are directly connected with each other and its tight coupling. There should be interface between them. This interface  is called JPA.

Note: Spring boot Application should not directly depend upon hibernate, Instead there should be an abstraction in between. That abstraction is JPA interface.

Q.50 What is JPA(Java Persistence API)?
Ans. JPA is a interface. Java provides JPA interface that can be implemented by different ORMs like Hibernate , MyBatis etc. 

Q.51 what is JDBC(Java Database Connectivity)?
Ans. Now hibernate need to interact with MySQL , Oracle DB etc. If Hibernate directly connect with MySQL, means its tight coupling, There should be an interface in between. This Interface is called JDBC Interface. JDBC provides drivers like MySQLjdbc, MSSQLjdbc etc. Now MySQL JDBC drivers will connect to MySQL database.
Note: Hibernate is used for relational database like MySQL, Postgres etc.

Conclusion: Java application is dependent on JPA interface. JPA interface is implemented by Hibernate. Hibernate is dependent on JDBC interface and JDBC interface is implemented by MySQL connection class.
If we use MySQL database in Spring boot Application , we need 2 dependency. 1. Spring Data JPA 2. MySQL Driver

In Spring, Spring data JPA is a dependency in spring boot which brings 2 supports together. JPA comes default with Java and Spring Data JPA includes Hibernate. We need to add dependency for Driver.

Q.52 What is Repository Pattern?
Ans. Code to interact with persistence layer should be separate from service layer. If Service layer directly interacts with database , this is tight coupling. Because Service layer is having all the code like create, update etc. In future if we change database then we have to change our Service layer which is not recommended. So we should use Repository layer. In this, service is dependent on database via Repository. All the database related operations performed at Repository layer.

Q.53 What is UUID (Universally Unique Identifier)?
Ans. 
1. When we use auto generated id as int or long, It can be accessed by anyone as anyone can assume what is next and data leak and security issue can happen, If we are using Integer auto generated Ids, we can not make them public. To make Ids public we use Random Ids which provides security.
2. Random ID is generated by a hashing function which takes lot of parameters like function(machine_id, datacenter_id, ip, timestamp, user_id).
3. There are multiple ways to generate random ids. One such way is UUID.
Example of UUID : a249ec0c-ffeb-41a6-896c-491c41b91a9c
4. We can generate it by https://www.uuidgenerator.net/
5. UUID is a 128 bit Number. It is a number, not alpha-numeric or String. Its difficult to represent or not easy to write 128 bits so people overcome this problem to make group of 4 bits, so total group bits was 32 bits. Now UUID can be represented in 32 bits. But why its look like alpha numeric. This is not alpha numeric. We converted binary into hexadecimal which represents numbers as character means from 1 t0 9 is same number but if number is 10, then we represent as 'A', 11 -> 'B', 12 -> 'C' etc.
6. Disadvantage: We store UUID in Database as Binary. When we store data in sorting order, then generated ID can be inserted anywhere to follow the order and all the data shifting happens which can make writes extremely slow. To improve this at least we guarantee that generated ID are greater than the previous one but not in incremented way. This can be achieved by timestamp. Timestamp always increasing. So IDs will be also in incremental state.

Q.54 How can we represent inheritance in DB?
Ans. There are 4 ways of representing inheritance in DB:
1. Mapped Superclass
2. Table Per Class
3. Joined table
4. Single Table
 When classes are related to each other with the concept of inheritance then how we can represent that kind of relationship in database.

Example we have users like Mentor, Instructor, TA etc. All these users are having common attribute like name and email and password and additional attributes also present.

1. Mapped Superclass:
a. When the parent class is not a real entity. Example: BaseModel is the dummy class which we created to store common attributes. This is just an abstract class and we don't create the object of this class.
b. No table for parent class
c. 1 table for  each child class will be created with their own attributes and parent class attributes
d. we use @MappedSuperclass
Mentor Table
----------------------------------------------------------------
name | email | password | company | avgRating | noOfSessions

Instructor Table
-----------------------------------------------------------
name | email | password | subject | experience 

TA table
-------------------------------------------------------------
name | email | password | avgRating | noOfSessions

Disadvantage:
1. Common attributes are present in every child class.
2. Query: Get email of all the users
select email from mentors
union
select email from instructors
union
select email from TA

We have to get that data from all the child and append to the list as union do. Have to run lot of queries to get data so this is not a good approach.
Example:
@MappedSuperclass
public abstract class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
}

@Entity
public class Employee extends BaseEntity {
    private String name;
}

@Entity
public class Manager extends BaseEntity {
    private String department;
}

2. Joined Table:
1. This is most frequently used way of storing inheritance in database.
2. Table for parent class
3. Table for each child class as well with their all attributes and the common attributes will be referred via Foreign key.
4. @Inheritance(strategy = InheritanceType.JOINED)

Users
--------------------------------------
userId | name | email | password

MentorU
-------------------------------------
userId | company | avgRating | noOfSessions

Instructor
------------------------------------
userId | subject | experience

TA 
-----------------------------
userId | avgRating | noOfSessions

Note: userId is foreign key mentor, instructor and TA table.

Disadvantage : we have to lot of joins.

Shot Example:
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee { ... }

@Entity
public class Manager extends Employee { ... }

3. Table per class:
1. This is exactly similar to Mapped superclass but we will have table for Parent class as well. 
2. When object of parent class is possible.
3. Table for each child class will be created with their own attributes and parent class attributes
4. @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

User Table
------------------------------------
name | email | password

Mentor Table
----------------------------------------------------------------
name | email | password | company | avgRating | noOfSessions

Instructor Table
-----------------------------------------------------------
name | email | password | subject | experience 

TA table
-------------------------------------------------------------
name | email | password | avgRating | noOfSessions

Short example:
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Employee { ... }

@Entity
public class Manager extends Employee { ... }

4. Single Table:
Create just one table with all the attributes.
Lot of nulls will be there, leads to spars table.
lot of space wastage
Extra type column is there t identify the type of entity

---------------------------------------------------------------------------------------
name | email | password | company | avgRating | noOfSessions | subject | experience 

Example:
-------------------------------------------
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "employee_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}

-------------------------------------
@Entity
@DiscriminatorValue("MANAGER")
public class Manager extends Employee {
    private String department;
}
------------------------------------------
@Entity
@DiscriminatorValue("DEVELOPER")
public class Developer extends Employee {
    private String programmingLanguage;
}


Q.55 What is pom.xml?
Ans. pom.xml is a configuration file used by Apache Maven, which is a build automation and dependency management tool for Java projects.
POM stands for Project Object Model.
The pom.xml file contains all the information Maven needs to build your project, such as:
1. Project details: name, version, description.
2. Dependencies: external libraries your project needs.
3. Plugins: tools for compiling, packaging, testing, etc.
4. Build Configurations

1. Project Coordinates
These uniquely identify your project in the Maven ecosystem.
<groupId>com.example</groupId>
<artifactId>my-app</artifactId>
<version>1.0.0</version>

groupId: Like a package name (e.g., com.company.project).
artifactId: The name of the project or module.
version: The version of your project.

2. Packaging
Defines the type of artifact Maven will create.
<packaging>jar</packaging>
Common values: jar, war, pom.

3. Dependencies
Lists all external libraries your project needs.
<dependencies>
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-core</artifactId>
        <version>5.3.10</version>
    </dependency>
</dependencies>

Each <dependency> has its own groupId, artifactId, and version.
Maven automatically downloads these from repositories.

4. Build Section
Controls how the project is built.
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.8.1</version>
            <configuration>
                <source>11</source>
                <target>11</target>
            </configuration>
        </plugin>
    </plugins>
</build>

5. Parent
If your project inherits from another POM (common in multi-module projects).
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>2.5.4</version>
</parent>

6.Profiles
For environment-specific configurations (dev, test, prod).
 <profiles>
    <profile>
        <id>dev</id>
        <properties>
            <env>development</env>
        </properties>
    </profile>
</profiles>


Note Whenever we face version issue in our pom.xml, we can remove spring version and related dependency version of spring framework which package is same as org.spring.framwork but others dependencies which are not from spring framework we can not remove version tag.

1. After adding all the dependencies in pom.xml
2. we add aur data source related properties in application.properties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
spring.datasource.username=myuser
spring.datasource.password=secret
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.show-sql=true

Explaination:
1. spring.jpa.hibernate.ddl-auto=update
Controls how Hibernate handles database schema.
Common values:

none → Do nothing.
update → Update schema automatically (adds missing columns, but doesn’t delete).
create → Creates schema every time (drops existing tables).
create-drop → Creates schema at startup, drops at shutdown.


Best practice: Use update for development, not for production.

2. spring.datasource.url=jdbc:mysql://localhost:3306/mydatabase
a. JDBC URL for your database.
b. Format:
jdbc:mysql://<host>:<port>/<database_name>
Here:
Host: localhost
Port: 3306 (default MySQL port)
Database: mydatabase

3. spring.datasource.username=myuser
Database username for authentication.

4. spring.datasource.password=secret

Database password for authentication.
Tip: Never hardcode passwords in production; use environment variables or secrets management.

5. spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

Specifies the JDBC driver class for MySQL.
For MySQL 8+, use com.mysql.cj.jdbc.Driver.

6. spring.jpa.show-sql=true

Enables logging of SQL queries in the console.
Useful for debugging.

How these work together

Spring Boot uses these properties to:

Connect to MySQL.
Configure Hibernate (JPA provider).
Automatically manage schema based on ddl-auto.
Show executed SQL queries.


If we use Postgress

1. Update application.properties
Replace MySQL properties with PostgreSQL ones:

spring.datasource.url=jdbc:postgresql://localhost:5432/mydatabase
spring.datasource.username=myuser
spring.datasource.password=secret
spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

2. Add PostgreSQL Dependency in pom.xml
Replace MySQL dependency with PostgreSQL:
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <version>42.7.3</version>
</dependency>

3. Install PostgreSQL

Use pgAdmin or psql CLI instead of MySQL Workbench.

CREATE DATABASE mydatabase;
CREATE USER myuser WITH PASSWORD 'secret';
GRANT ALL PRIVILEGES ON DATABASE mydatabase TO myuser;

Q.56  What are the types of queries to interact with the database in spring boot application using JPA/Hibernate.
Ans. 
1. Derived Queries(Method Name Queries)
2. HQL(Hibernate Query Language) or JPQL(Java Persistence Query Language)
3. Native Queries

1. Derived Queries(Method Name Queries):

If we are using Spring data JPA and hibernate, we are not writing basic queries manually because if we migrate from database to another database the we have to change queries as well. because we have to change queries bit, They are not going to work as it is. Hibernate provides support to connect with database so hibernate should provide a way to automatically write the query for us. Those type of queries are called as derived Queries.

Example:
Query creation from method names:
public interface UserRepository extends Repository<User, Long> {

  List<User> findByEmailAddressAndLastname(String emailAddress, String lastname);
}

Above method transiting into query -> select u from User u where u.emailAddress = ?1 and u.lastname = ?2

Example:
Supported keywords inside method names:
Derived queries having 2 parts one is before "by" and another one is after "by". "by" is like where clause in our sql query. and find is like select query.

Ex: 
Keywords         |     method Saple
Or                  findByLastnameOrFirstname
And                 findByLastnameAndFirstname
Between             findByStartDateBetween
LessThan            findByAgeLessThan
LessThanEqual       findByAgeLessThanEqual
GreaterThan         findByAgeGreaterThan
GreaterThanEqual    findByAgeGreaterThanEqual
After               findByStartDateAfter
Before              findByStartDateBefore
IsNull              findByAge(Is)Null
NotNull             findByAge(Is)NotNull
Like                findByFirstnameLike
NotLike             findByFirstnameNotLike
StartingWith        findByFirstnameStartingWith
EndingWith          findByFirstnameEndingWith
Containing          findByFirstnameContaining
OrderBy             findByAgeOrderByLastnameDesc
Not                 findByLastnameNot
IgnoreCase          findByFirstnameIgnoreCase
In                  findByAgeIn(Collection<Age> ages)
NotIn               findByAgeNotIn(Collection<Age> ages)


Example: 
@Repository
public interface ProductRepositories extends JpaRepository<Product, Long> {
    @Override
    Optional<Product> findById(Long aLong); //select * from Products where id = ?

    @Override
    List<Product> findAll(); //select * from products;

    //select * from Products where title = ?
    List<Product> findByTitle(String string);

    //select * from Products where title like %string%;
    List<Product> findByTitleContains(String string);

    //select * from products where price>=x and price <=y;
    List<Product> findByPriceBetween(Double x, Double y);

}


2. HQL query:
Hibernate gives very general queries. If we want go for specific queries and want to provide custom queries, we can approach either HQL or Native Query.
When we write custom queries we have to remember lot of things like table name, columns names etc. It is close to SQL query only but instead of tables name we can play with models name.
Using @Query we can write our custom queries and we can return whatever we want to get from query using projections.
@Query("select title, price from Product where id = 10 ")
    List<ProductWithTitleAndPrice> findTitleAndPriceById(Long id);

What JPA see, we are returning interface then projections come into picture and it executes the query and whatever response is there from query, it will cast that response into  the references of the interface.

Projections has interface which defines getters methods only.
public interface ProductWithTitleAndPrice {
    String getTitle();
    Double getPrice();
}

JPQL works on entities, not tables. You define queries using @Query.

Example:
@Query("SELECT p FROM Product p WHERE p.price > :price")
List<Product> findProductsCostlierThan(@Param("price") BigDecimal price

Advantage: When we choose our database, we do not need to change query as is written based on entities not table names.

3. Native SQL Queries:
Direct SQL queries using @Query with nativeQuery = true.
Example:
 @Query(value = "select p.title, p.price from products p where p.id = 9", nativeQuery = true)
    List<ProductWithTitleAndPrice> findTitleAndPriceById();

Q.56 What does @Param do?
Ans. @Param is used in Spring Data JPA to bind a method parameter to a named parameter in a JPQL or SQL query.


Q.57 What is projections?
Ans. In Spring Data JPA, projections are a way to retrieve only specific fields from an entity instead of fetching the entire entity. This is useful for performance optimization and reducing unnecessary data transfer.

Why use projections?

1. You don’t always need all columns of an entity.
2. Fetching only required fields improves query performance.
3. Avoids exposing sensitive fields.

Types of Projections in Spring Data JPA
1. Interface-based Projection
You define an interface with getters for the fields you want.

Example:
public interface ProductWithTitleAndPrice {
    String getTitle();
    Double getPrice();
}

Repository:

@Query("SELECT p.title AS title, p.price AS price FROM Product p")
List<ProductWithTitleAndPrice> findTitleAndPrice();

List<ProductWithTitleAndPrice> findTitleAndPrice();Show more lines
Spring maps the query result to the interface automatically.




Q.57 Difference between @Primary and @Qualifier?
Ans. Both @Primary and @Qualifier are used in Spring Dependency Injection to resolve bean ambiguity, 

@Primary
1. Marks a bean as the default choice when multiple beans of the same type exist.
2. If you have two beans of the same type and no @Qualifier is specified, Spring will inject the one marked as @Primary.
3. Priority : Lower than @Qualifier
4. Scope: Class-level or method-level bean
Example:
@Configuration
public class AppConfig {

    @Bean
    @Primary
    public EmployeeService employeeServiceImpl1() {
        return new EmployeeServiceImpl1();
    }

    @Bean
    public EmployeeService employeeServiceImpl2() {
        return new EmployeeServiceImpl2();
    }
}

Injection:

@Autowired
private EmployeeService employeeService; // Injects employeeServiceImpl1

@Qualifier
Used to explicitly specify which bean to inject when multiple beans of the same type exist.
2. Overrides @Primary if both are present.
3. Priority: Higher than @Primary
4. Scope: Field or parameter level injection

Q.58 Why @Repository on Repository Interface but not on Service Interface?
Ans. 
Repository Layer

ProductRepository extends JpaRepository.
Spring Data JPA creates a proxy implementation for this interface at runtime.
That proxy is a bean, so Spring needs to know it belongs to the persistence layer.
@Repository: Marks it as a DAO component.
Even though Spring Data JPA auto-registers repositories, @Repository is still considered best practice.

2. Service Layer:

ProductService is just an interface (a contract).
Spring does not create a bean from the interface.
The bean comes from the implementation class (e.g., ProductServiceImpl).
So we annotate implementation with @Service, not the interface.

Q.59 why it’s not mandatory to annotate a repository interface with @Repository?
Ans. 
it’s not mandatory to annotate a repository interface with @Repository when it extends JpaRepository in Spring Data JPA. Here’s why:
2. Why it’s optional: Spring Data JPA automatically detects repository interfaces through @EnableJpaRepositories (or via @SpringBootApplication which includes it). 
3. It creates a proxy implementation and registers it as a Spring bean without needing @Repository.
4. Why you might still use @Repository: 
a. Exception Translation: @Repository triggers Spring’s PersistenceExceptionTranslationPostProcessor, converting low-level exceptions (like SQLException) into Spring’s DataAccessException.
b. Semantic clarity: Indicates that this interface belongs to the data access layer.


Q.60 how save() method works?
Ans.
Product save(Product product);

If We pass Product object if it comes with Id means product object exist in the database and we just have to update it.
If We pass Product object ,if it Id is not associated with it, means new object will be inserted in  the database.

Note: same method is called for update and insert so it is called upsert().
Update + Insert = Upsert

Q.61 Mostly used git commands?
Ans. 
1. 
Configuration
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git config --list

2. Repository Management
git init                      # Initialize a new repo
git clone <url>               # Clone a repo
git remote -v                 # View remotes
git remote add origin <url>   # Add remote
git remote remove origin      # Remove remote

3. Basic Workflow
git status                    # Check status
git add <file>                # Stage file
git add .                     # Stage all changes
git commit -m "Message"       # Commit changes
git commit --amend            # Amend last commit

4. Branching
git branch                    # List branches
git branch <name>             # Create branch
git checkout <name>           # Switch branch
git checkout -b <name>        # Create & switch
git branch -d <name>          # Delete branch

5. Merging & Rebasing
git merge <branch>            # Merge branch
git rebase <branch>           # Rebase onto branch
git rebase --continue         # Continue rebase
git rebase --abort            # Abort rebase

6. Remote Operations
git push origin <branch>      # Push branch
git push -u origin <branch>   # Push & set upstream
git pull origin <branch>      # Pull changes
git fetch                     # Fetch without merge

7. Undo & Reset
git reset <file>              # Unstage file
git reset --hard HEAD         # Reset all changes
git revert <commit>           # Revert commit
git checkout -- <file>        # Discard changes

8. Viewing History
git log                       # Full history
git log --oneline             # Compact history
git log --graph --decorate    # Visual graph
git diff                      # Show changes

9. Tags
git tag                       # List tags
git tag <name>                # Create tag
git push origin <tag>         # Push tag

10. Stash
git stash                     # Save changes
git stash list                # List stashes
git stash pop                 # Apply stash

Q, What is testing and its key points?
Ans.Testing in software development is the process of evaluating a system or its components to ensure they meet specified requirements.
 It helps identify defects, improve quality, and build confidence in the software.

Key Points About Testing:
Goal: Verify correctness, reliability, and performance.

Types of Testing:
1. Unit Testing: Tests individual components (functions, classes).
2. Integration Testing: Tests how components work together.
3. System Testing: Tests the entire application as a whole.

Q.62 What is Unit Testing and why testing?
Ans. 
1. Testing: As a developer, we should not just do the development, we should also write the automated test cases for our development.
test cases are the part of the development efforts.
2. Before we merge any new feature, all the test cases will execute and if any of the test cases fail, we will not be allowed to merge our feature.
Note:
first write feature -> then write test cases -> and then submit the code.
3.Unit testing is a software testing technique where individual components or “units” of a program (like functions, methods, or classes) are tested in isolation to ensure they work as expected.
4. Purpose: Verify that each small piece of code performs correctly.
5. Scope: Focuses on one unit at a time, not the entire system.
6. Benefits:
Detects bugs early in development.
Makes code easier to maintain and refactor.
Improves reliability and confidence in changes.
7. Testing in isolation
8. Every code unit should be tested individually without any dependency involved.
9. Unit test cases are generally short & fast.
10. Hard code the dependency. Hard code means mocking and assuming that dependency is giving us expected output.
11. we call it first level of testing.


Q.63 What is Test Driven Development(TDD)?
Ans. What happens in this first we write the test cases, then we write the featue and then submit the code.
Test-Driven Development (TDD) is a software development approach where you write tests before writing the actual code. It’s part of agile practices and helps ensure your code meets requirements from the start.

How TDD Works (The Cycle):
1. Write a Test
Create a test for a small piece of functionality that doesn’t exist yet.
2. Run the Test (It Fails)
Since the feature isn’t implemented, the test fails. This confirms the test is valid.
3. Write Code to Pass the Test
Implement the minimum code needed to make the test pass.
4. Run Tests Again
Ensure all tests pass.	
5. Refactor
Clean up the code while keeping tests green.
6. Repeat
Continue for each new feature.

Q.64 What is Flaky tests?
Ans. Flaky means unreliable means untrustworthy. 
Sometimes the test cases is passing, sometimes the test cases is failing.
Flaky tests are tests that sometimes pass and sometimes fail without any changes to the code. In other words, their outcome is inconsistent and unreliable, which makes them hard to trust.

Why Do Flaky Tests Happen?
1. Timing issues (e.g., race conditions in multi-threaded code).
2. Randomness in code (e.g., using random values without proper seeding).
Example:
2 threads are running one is just adding the count and one is subtracting the count in that scenario, sometimes will get count == 0 means test cases passed and sometimes it will be random values then test cases wil get failed.
Thread 1: 
count = 0;
for(int i = 0; i<=100; i++){
count = count + i;
}

Thread 2:
count = 0;
for(int i = 0; i<=100; i++){
count = count - i;
}

if(count == 0){
test cases passed
}
else{
fails
}

Note: Our codebase should not flaky test cases.

Q.65 what is Test Coverage/Code coverage?
Ans. 
Test coverage is a software testing metric that measures how much of your code is executed when you run your tests. It helps you understand the effectiveness of your test suite and identify untested parts of the code.
1. lines that get executed by test classes.
2. % of lines of code executed by all the test cases combined.
3. Expected code coverage is 75-80%.

Key Points About Test Coverage:
Definition: The percentage of code (functions, statements, branches, or conditions) that is covered by automated tests.
Purpose: Ensures that critical paths and logic in your application are tested, reducing the risk of bugs.

Types of Coverage:
1. Statement Coverage: Checks if each line of code is executed.
2. Branch Coverage: Ensures all possible branches (e.g., if and else) are tested.
3. Function Coverage: Verifies that every function is called during tests.
4. Condition Coverage: Tests all boolean expressions in decision points.

Formula:

Test Coverage (%)=(Number of lines executed by tests/Total number of lines of code)×100

Tools:
1. JaCoCo (Java Code Coverage)
Most widely used for Java projects.
Integrates with Maven, Gradle, and IDEs like Eclipse and IntelliJ.
Generates detailed HTML reports.
Supports branch, line, and method coverage.

2. Cobertura
Older but still used in some legacy projects.
Works with Maven and Ant.
Provides coverage reports in XML and HTML.

3. IntelliJ IDEA Built-in Coverage
If you use IntelliJ, it has built-in coverage analysis.
Supports line and branch coverage.

4.  SonarQube
Not just coverage—it also checks code quality.
Integrates with JaCoCo for coverage metrics.


Q.66 What is Integration Testing?
Ans. 
1. Example: Method a() is having some lines of code and internally calling method b() a well.

method a()
{
statement 1...
statement 2...
statement 3...
method b();
statement 4...
statement 5...
statement 6...
}

2. In Integration testing, we are not hard coding the dependency, we are not mocking dependency. We are calling the real dependencies.
3. In Unit testing, we are testing method a(), we hardcode the dependency method b() means we are setting expected output for dependency but In integration testing, we are calling method b() as well.
4. We call it second level of testing.
5. Slower than unit testing as we are calling dependency as well.

Example: 
we have productController having method a() with dependency of service method b().

ProductController{

method a()
{
statement 1...
statement 2...
statement 3...
product service method b();
statement 4...
statement 5...
statement 6...
}

We have ProductService having method b() having the dependency of repository method c().

method b()
{
statement 1...
statement 2...
statement 3...
product repository method c();
statement 4...
statement 5...
statement 6...
}

We have ProductRepository having method c() having the dependency of DB call.

method c()
{

DB call();
}

In Unit testing , we take 1 class as ProductController and write test cases for each methods like method a() and hard code the dependency method b() or we mock the method b() means Assuming product Service method b() is giving correct output.

In Integration Testing, we call dependency method as well. ProductController method a() will call the real method b() of product service which is called Integration testing of method a() happened.
But if we do Integration Testing of method c() which is having DB call which might fail sometime due to network calls and we don't get expected output from DB which breaks the test case.
Note: To overcome this issue, we call the dependency which is internal to out system/application. We don't call the external dependency like DB calls, network calls etc. but we just mock them or hardcode them.

2. Functional Testing:
No Mocking at all means No dependency call at all.
This complete end to end testing.

Q.67 what to test?
Ans. When we create inputs and for each input we define expected output.

1. Positive Case:
Definition: Tests where you provide valid, expected inputs to confirm the system works as intended.
Goal: Verify the application behaves correctly under normal conditions.
Example 1: Enter a valid username and password → Login succeeds.
Example 2: When we pass unsorted array and expect sorted array. This is a positive scenario. 


2. Negative Case:
Definition: Tests where you provide invalid or unexpected inputs to check how the system handles errors.
Goal: Ensure the system does not break and shows proper error messages.

Example 1: Enter an incorrect password → System displays “Invalid credentials.”
Example 2: When we pass wrong id in our api to get the product from DB, if ID is not correct and will throw ProductNotFoundException. Passing incorrect Id which is not excepting from user considered as negative scenario.

3. Edge case:
Definition: Tests that use extreme or boundary values (minimum, maximum, or unusual conditions).
Goal: Validate the system’s behavior at limits.

Example 1: Enter a password with exactly 1 character or maximum allowed characters.
Test with empty input or special characters.
Example 2: when our array or list is empty. We can consider this as a edge case. 
Scenarios which can be handled by positive and negative cases. For this type of scenario we have put separately if-else conditions. 
Edge cases are the scenarios because of this bugs happens.

Q.68 What are best practices on Testing?
Ans. 
1. Fast: Test cases should be fast.
 If test cases are taking longer time than build will also take long time and development life cycle becomes slow. PR needs test cases should be passed and then build will happen.

2. 3A's Framework: We should use 3A's framework in order to write the test cases.
We can divide functionality into 3 steps.
1. A -> Arrange 
2. A -> Act
3. A -> Assert

1. Arrange:  We have to Arrange the inputs parameters which we want to execute the test cases. Just to arrange the inputs we can not use Scanner. We can not dependent on any external or third party. It can not be automated. At the time of build, test cases are running automatically and no one will their to provide the inputs at the time of build. Everything should be automated if we need any inputs, we should hard code it.

2. Act: Once we got the input parameters, we have to act upon the data, we have to call the function that we want to test.

3. Assert: Validate /compare the actual output v/s expected output. 
Actual output is the output which Method has returned with Arranged inputs.
Expected output is the output which we expecting from the method.

3. 3C's Frameowrk: We call it as 3C's framework.
1. C -> Create
2. C -> Call
3. C -> Compare

4. Isolated: Testcases should be isolated with each other. We are talking about Unit test cases. Unit test methods should fail if issues with that method only and dependencies will be mocked or hardcoded.	

5. Repeatable: Test cases should be repeatable means Test cases should not be flaky.

6. Self sufficient/Self checking: Test cases should be Self sufficient/Self checking means No human intervention is required to execute the Test cases.

7. Test the behaviours, not the implementation:
If test cases are dependent on method implementation, if implementation we change in future, out test cases will be failed. 
If test cases are dependent on method behavior, then it will passed every time if we do change the implementation.
Implementation can change but the behaviour won't.
Example sorting the array, we can use merge sort and later if we change from merge sort to quick sort, still method result should be sorted array means still behaviour is same as its returning sorted array.

8. Keep test cases static as long as possible.

Q.69 What is Mocking?
Ans. It is nothing but the hardcoding the dependencies.
Mocking allows us to hardcode the external  dependencies so that we can test our code in isolation.

Example:
ProductController{

ProductService ps;

getProductById(long id){
..
...
Product p= ps.getProductById(id);
..
..
}

Note:
To test the ProductController's method getProductById(long id) has dependency on ProeductService's getProductById(id). For ProductController only ProductService matters, what ProdcutService calls or does, we don't care to write test case for controller's method.

TestCase:

ProductControllerTest {

// required object(Real object) to call the method getProductById(Long id) which is available in ProductController class.
ProductController pc; 

//Mocked Object because we don't need real Product Service object as we are not calling real method getProductById(id) of ProductService.
ProductService ps;

testGetProductById(int id){  ---> This is wrong as we can not provide input parameters to test methods. At build time no one will be there to provide id, so Test cases does not accept any input parameter.

testGetProductById(){

//Arrange : first we have to arrange the inputs, If Objects are there input, we have to create the Objects as well.
int id = 10;

//Real ProductController object's method getProductBy(Long id) is having dependency of ProductService's method getProductById(id). So in Unit testing we have to Mock the dependency or we have to hardcode the dependency. We have to hardcode the output of dependency. 
when(ps.getProductById(id).thenReturn("HardCodedData");   --> This is called Mocking.

//Act : call the method which we want to test, To call that method we need the object of ProductController so that we can call that method.
ResposneEntity<Product>  re = pc.getProductById(id);

//Assert : we check we are getting expected output or not.

}


Q.70 What is Types of Doubles?
Ans. Doubles means a person who looks exactly like another.
To hardcode the dependency we mock the object means we duplicates the object. We can Double the dependencies in different ways.
1. Mock
2. Stub
3. Fake

We hardcode the dependencies while writing test cases using Double.

1. MOCK:
Note: Mock and Mocking are different. Mocking is a concept but Mock is way to Mocking means a way to hardcode the dependency.
a. Mock is a type of Double which just returns the hardcoded values.
Example: when(ps.getProductById(id).thenReturn("HardCodedData");

b. This type of Mock does not allow any dynamic value. It returns the same hardcoded value.

UseCase: 
create 5 products
getCount() == 5   <--Assert
create 1 more product
getCount() == 6   <--Assert

If we use Mock, we have limitation we can not return the different hardcoded values. If we mocked object and return something it will return the same hardcoded values in the entire scope.
In above use case we can see we created 5 products and got count 5 as hardcoded value, later we added 1 more product, now  mocking should return
6 but this does not happen as Mock does not allow dynamism.

Disadnantage: It returns very restrict hardcoded values.

2. STUB:
In reality, we need dynamism values as well. Every time we can not get the same hardcoded values.
In Stud, instead of mocking one value, we create a copy class.
A stub is class that we create to replicate the actual behaviours.

Example:
class ProductRepoStub {

int count = 0;

void createProduct(){
count++;
}

int getCount(){
return count;
}
}

Now we want to write testcases for ProductService class.

class ProductServiceTest{

//will use Mocked Object and here we use Stub class ProductRepoStub. but again directly we can not keep ProductRepoStub in ProductServiceTest class as it will lead to tight coupling so what we can do, we can create an interface ProductRepo which have all methods like create, update , delete and ProductRepoStub will implement ProductRepo interface.
PropductRepo pr;
....
....
... .
}

Note: Stub is closer to Reality than Mock.

3. FAKE: 
FAKE is closer to reality than Stub. We create fake database and work with Fake database. Fake database like create Map and store data into that.

Example:
class ProductRepoFake implements ProdcutRepo {
Map<Long, Proudct> db = new HashMap<>();
id = 0;

save(Product p){
if(p.getId() == NULL){
p.setId(++id);
db.put(id, p);
}
db.put(id, p)l
}
}

getCount(){
return id; 
}
..
..
}


Q.71 Example of simpleTest()?
Ans. public class RandomTests {

    //Test case - method which gets executed automatically at
    // the time of building or deployment etc.

    //They don't accept any input and don't return anything.
    @Test
    public void sampleTest(){

        //Arrange(input params)
        int a = 10;
        int b = 7;

        //Act(Call the function that we want to test)
        int result = a + b;

        //Assert(Validate the actual output against to the expected one)
        assert result == 17;
        
    }
}

Q.72 What are JUnit Assert Methods?
Ans.
1. assertEquals(expected, actual):
Checks if two values are equal.
Ex:
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MathTest {
    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result); // Passes because 2+3 = 5
    }
}

2. assertNotEquals(expected, actual)
Checks if two values are not equal.
Ex:
@Test
public void testNotEqual() {
    int result = 2 + 2;
    assertNotEquals(5, result); // Passes because 4 != 5

3. assertTrue(condition)
Checks if a condition is true.
Ex:
@Test
public void testPositiveNumber() {
    int number = 10;
    assertTrue(number > 0); // Passes because 10 > 0
}

4. assertFalse(condition)
Checks if a condition is false.
Ex:
@Test
public void testNegativeNumber() {
    int number = -5;
    assertFalse(number > 0); // Passes because -5 > 0 is false
}

5. assertNull(object)
Checks if an object is null.
Ex:
@Test
public void testNullObject() {
    String str = null;
    assertNull(str); // Passes because str is null
}

6. assertNotNull(object)
Checks if an object is not null.
Ex:
@Test
public void testNotNullObject() {
    String str = "Hello";
    assertNotNull(str); // Passes because str is not null
}

7. assertSame(expected, actual)
Checks if two references point to the same object.
@Test
public void testSameObject() {
    String str1 = "Hello";
    String str2 = str1;
    assertSame(str1, str2); // Passes because both refer to same object
}

8. assertNotSame(expected, actual)
Checks if two references point to different objects.
Ex:
@Test
public void testDifferentObjects() {
    String str1 = new String("Hello");
    String str2 = new String("Hello");
    assertNotSame(str1, str2); // Passes because they are different objects
}

9. assertThrows(expectedException, executable)
Checks if a block of code throws a specific exception.
Ex:
@Test
public void testDivideByZero() {
    assertThrows(ArithmeticException.class, () -> {
        int result = 10 / 0;
    });
}

10. assertTimeout(Duration duration, Executable executable)
Duration duration: The maximum time allowed for the code to run.
Executable executable: The code block (usually a lambda) to execute.
Ex:
import static org.junit.jupiter.api.Assertions.assertTimeout;
import java.time.Duration;
import org.junit.jupiter.api.Test;

public class TimeoutTest {

    @Test
    void testShouldCompleteWithinTime() {
        assertTimeout(Duration.ofSeconds(2), () -> {
            // Simulate some work
            Thread.sleep(1000); // 1 second
        });
    }
}
This test will pass because the code finishes in 1 second (less than 2 seconds).
Ex: 
@Test
void testShouldFailIfTooSlow() {
    assertTimeout(Duration.ofSeconds(1), () -> {
        Thread.sleep(2000); // 2 seconds
    });
}
This test will fail because the code took longer than 1 second.

Q.72 What is JUnit?
Ans,
1. JUnit is a Java testing framework used to write and run unit tests.
2. It provides:
Annotations like @Test, @BeforeEach, @AfterEach.
Assertions like assertEquals(), assertThrows().
3. Purpose: Verify that individual units (methods/classes) work as expected.

Q.73 What is Mockito?
Ans.
1. Mockito is a Java mocking framework used for unit testing.
2. Its main purpose is to create mock objects for dependencies so you can test a class in isolation without relying on real implementations or external systems (like databases, APIs).

Why Use Mockito?
To avoid loading the full Spring context for unit tests.

Key Features:
1. Create mocks using @Mock.
2. Inject mocks into the class under test using @InjectMocks.


They are annotations used in testing frameworks and Spring Boot to control how tests are executed and how dependencies are handled. Let’s break them down:

Mockito Annotations:
1. @Mock
Creates a mock object for a dependency.
Ex:
@Mock
private ProductService productService;
This is a fake object that simulates the real ProductService.

2. @InjectMocks
Creates an instance of the class under test and injects mocks into it.
Ex:
@InjectMocks
private ProductController productController;
This creates ProductController and injects the mocked ProductService.

Spring Boot Testing Annotations:
3. @SpringBootTest
Loads the full Spring application context for integration tests.
Ex:
@SpringBootTest
public class ProductControllerIntegrationTest {
    @Autowired
    private ProductController productController;
}
Useful for testing with real beans and configuration.

4. @MockBean (Deprecated in Spring Boot 3.4+)
Replaces a bean in the Spring context with a Mockito mock.
Ex:
@MockBean
private ProductService productService;
 Allows integration tests with real context but mocked dependencies.

How JUINT and Mockito Work Together:
Mockito approach → Fast unit tests, no Spring context.
Spring Boot approach → Integration tests, real context but can mock beans.

5. Key Difference:
JUnit → Runs tests and provides assertions.
Mockito → Creates mocks and stubs for dependencies.

Q.74 What @SpringBootTest does?
Ans. @SpringBootTest is a Spring Boot testing annotation that tells JUnit to start the full Spring application context for your test.
What It Does:

1. Loads the entire Spring Boot application context (like running your app).
2. Enables dependency injection for beans (@Autowired works).
3. Useful for integration tests where you want to test multiple layers together (Controller → Service → Repository → DB).

Key Features:
1. By default, it: Scans for @SpringBootApplication or @SpringBootConfiguration.
2. Creates all beans defined in your application.
3. Allows you to use @MockBean to replace real beans with mocks.

Q.74 Test cases for ProductController?
Ans. @SpringBootTest
public class ProductControllerTest {
    @InjectMocks
    private ProductController productController;

    @Mock
    private ProductService productService;

    @Test
    public void testGetSingleProductPositive() throws ProductNotFoundException {
        //Arrange
        Long productId = 9L;

        Product expectedOutput = new Product();
        expectedOutput.setId(productId);
        expectedOutput.setTitle("iphone 15");
        expectedOutput.setDescription("Best ever phone");
        expectedOutput.setImageUrl("mobile.jpg");
        expectedOutput.setPrice(150000.00);
        Category category = new Category();
        category.setId(1L);
        category.setName("Mobile");
        expectedOutput.setCategory(category);

        when(productService.getSingleProduct(productId)).thenReturn(expectedOutput);


        //Act
        Product actualProduct = productController.getSingleProduct(productId);

        //Assert
        assertEquals(expectedOutput, actualProduct, "Products are not same");

    }
Note: Your test works even though you mixed @SpringBootTest, @InjectMocks, and @Mock because of how Mockito and Spring Boot behave together:

Why It Works:

@SpringBootTest loads the Spring context, but you never use Spring beans in this test because:

productController is created by Mockito via @InjectMocks, not by Spring.
productService is mocked by Mockito via @Mock, not by Spring.


So effectively, this is a pure Mockito unit test, even though @SpringBootTest is present (it just adds overhead).

What Happens Internally:

@InjectMocks creates an instance of ProductController and injects the @Mock ProductService into it.
The Spring context from @SpringBootTest is not used because you never @Autowired anything.
Your test passes because Mockito handles the injection, not Spring.

Why This Is Not Ideal:

@SpringBootTest starts the entire application context → slow and unnecessary for a unit test.
Mixing @InjectMocks and @SpringBootTest is confusing because:

Either you test with Spring beans (@Autowired + @MockBean).
Or you test with Mockito only (@InjectMocks + @Mock).

Correct Approaches:
1. Option 1: Pure Unit Test (Fast)
Ex:
@ExtendWith(MockitoExtension.class)
class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    @Test
    void testGetSingleProductPositive() throws ProductNotFoundException {
        Long productId = 9L;
        Product expectedProduct = new Product();
        expectedProduct.setId(productId);
        expectedProduct.setTitle("iPhone 15");
        expectedProduct.setDescription("Best ever phone");
        expectedProduct.setImageUrl("mobile.jpg");
        expectedProduct.setPrice(150000.00);
        Category category = new Category();
        category.setId(1L);
        category.setName("Mobile");
        expectedProduct.setCategory(category);

        when(productService.getSingleProduct(productId)).thenReturn(expectedProduct);

        Product actualProduct = productController.getSingleProduct(productId);

        assertEquals(expectedProduct, actualProduct);
    }
}
Note: No Spring context → fast.

Option 2: Integration Test with Spring
Ex:
@SpringBootTest
class ProductControllerIntegrationTest {

    @Autowired
    private ProductController productController;

    @MockBean
    private ProductService productService;

    @Test
    void testGetSingleProductPositive() throws ProductNotFoundException {
        Long productId = 9L;
        Product expectedProduct = new Product();
        expectedProduct.setId(productId);
        expectedProduct.setTitle("iPhone 15");
        expectedProduct.setDescription("Best ever phone");
        expectedProduct.setImageUrl("mobile.jpg");
        expectedProduct.setPrice(150000.00);
        Category category = new Category();
        category.setId(1L);
        category.setName("Mobile");
        expectedProduct.setCategory(category);

        when(productService.getSingleProduct(productId)).thenReturn(expectedProduct);

        Product actualProduct = productController.getSingleProduct(productId);

        assertEquals(expectedProduct, actualProduct);
    }
}
Note: Uses Spring context, good for integration tests.

Q. What is Integration testing?
Ans. Integration testing is a software testing level where individual modules or components that have already been unit-tested are combined and tested as a group to verify that they work together correctly.

Q. Types of Integration Testing?
Ans.
1. Big Bang – All modules together (not your case).
2. Incremental – Step-by-step integration. Ex: Top-Down / Bottom-Up – Usually for layered systems.
3. Component-Level Integration – Testing a specific layer with its dependencies (your case).
4. End-to-End Integration – Full system with DB, network, etc.

Q. What things needed to start integration testing?
Ans. 
1. Application Build and Modules Ready:
All individual modules/components should be unit tested and stable.

2. Add Dependency:

What does spring-boot-starter-test include?
1. JUnit 5 (Jupiter) → for writing and running tests.
2. Mockito → for mocking dependencies.
3. Spring Test → for loading Spring context in tests (@SpringBootTest, MockMvc, etc.).
4. AssertJ → for fluent assertions.
5. Spring Boot Test Auto-Configuration → simplifies test setup.

So, by adding this single dependency, you get everything needed for:
Unit tests
Integration tests
MockMvc tests
JSON validation

<!-- Core testing -->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
</dependency> 

  <!-- H2 (in-memory) -->
  <dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>test</scope>
  </dependency

 <!-- OR Testcontainers for real DBs in Docker -->
  <dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>junit-jupiter</artifactId>
    <scope>test</scope>
  </dependency>
  <dependency>
    <groupId>org.testcontainers</groupId>
    <artifactId>postgresql</artifactId> <!-- or mysql -->
    <scope>test</scope>
  </dependency>

3. create application-test.properties
It’s a Spring profile-specific configuration file used when you run tests with @ActiveProfiles("test").
Put it under:
src/test/resources/application-test.properties
Example: H2 in memory DB

spring.datasource.url=jdbc:h2:mem:productdb;DB_CLOSE_DELAY=-1;MODE=PostgreSQL
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.hibernate.ddl-auto=create-drop
spring.jpa.show-sql=true

4. Recommended annotations for integration tests
1. @SpringBootTest
Boots the full Spring context.
2. @AutoConfigureMockMvc
Autoconfigures and injects MockMvc for controller tests without starting a server.
3. @ActiveProfiles("test")
Uses application-test.properties.
4. @Transactional (optional)
Roll back DB changes per test (useful for consistency; avoid if you test async/queues).
5. @AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY) tells Spring Boot’s test auto-configuration to replace whatever DataSource your application would normally use (Postgres/MySQL/etc.) with an embedded, in-memory database (e.g., H2/HSQL/Derby) for the duration of the test.

5. Folder Structure:
src
├── main/java
├── main/resources
├── test/java                     <-- integration/unit tests
└── test/resources                <-- application-test.properties

Ex: 
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.ANY)
@Tag("integration")
public class ProductControllerIT {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private ProductRepository productRepository;


    @BeforeEach
    void cleanDb() {
        productRepository.deleteAll();
    }

    //build a product object
    private Product product(String title, String categoryName, double price) {
        Product p1 = new Product();
        p1.setTitle(title);
        p1.setDescription("Best ever phone");
        p1.setImageUrl("mobile.jpg");
        p1.setPrice(price);
        Category category = new Category();
        category.setName(categoryName);
        p1.setCategory(category);
        return p1;
    }

    //create a product via API
    private Product create(Product request) throws Exception {
        String json = objectMapper.writeValueAsString(request);
        String createdJson = mockMvc.perform(post("/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(json))
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andReturn().getResponse().getContentAsString();
        return objectMapper.readValue(createdJson, Product.class);
    }

Explanation:

// create a product via API
private Product create(Product request) throws Exception {
    // 1) Serialize the request object to JSON
    String json = objectMapper.writeValueAsString(request);

    // 2) Perform an HTTP POST to /products with that JSON as the body
    String createdJson = mockMvc.perform(post("/products")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(json))
            // 3) Assert the API responded with HTTP 201 (Created)
            .andExpect(status().isCreated())
            // 4) Assert the response Content-Type is JSON (or compatible)
            .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
            // 5) Extract the raw response body as a String
            .andReturn().getResponse().getContentAsString();

    // 6) Deserialize the response JSON back into a Product object and return it
    return objectMapper.readValue(createdJson, Product.class);
}

What’s happening conceptually

1. objectMapper.writeValueAsString(request)
ObjectMapper is a class provided by the Jackson library in Java. It’s used to convert between Java objects and JSON (serialization and deserialization)
Converts your Product request object into a JSON string. This is what your API expects in the request body.
2. mockMvc.perform(post("/products")...)
Uses Spring’s MockMvc to simulate an HTTP POST request to your controller endpoint without starting a real server.
.contentType(MediaType.APPLICATION_JSON) sets the Content-Type header to application/json.
.content(json) sends the serialized product as the request body.
3. Assertions on the response
.andExpect(status().isCreated()) verifies the endpoint correctly returns 201 Created for a successful creation.
.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON)) verifies the response is JSON (or compatible), ensuring the server follows content negotiation correctly.
4. Extracting and parsing the response
.andReturn().getResponse().getContentAsString() pulls out the response body (which should be the created product’s JSON, often including the generated id).
objectMapper.readValue(createdJson, Product.class) converts that JSON back into a Product instance that you can use in the rest of your test (e.g., to assert fields like id, title, etc.).

Ex:
 @Test
    @DisplayName("Post /products -> returns 201 and product body")
    public void createProduct_returns201_andBody() throws Exception {
        //Arrange
        Product request = product("iPhone 15 pro", "Electronics", 80000.0);

        //Act + Assert
        mockMvc.perform(post("/products")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(request)))
                .andExpect(status().isCreated())
                .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").exists())
                .andExpect(jsonPath("$.title").value("iPhone 15 pro"))
                .andExpect(jsonPath("$.category.name").value("Electronics"))
                .andExpect(jsonPath("$.price").value(80000.0));
    }


1. Test annotations
@Test: Marks this method as a JUnit test.
@DisplayName("Post /products -> returns 201 and product body"): Gives the test a readable name in reports/IDE runners.

2. Arrange (setup the input)
   Product request = product("iPhone 15 pro", "Electronics", 80000.0);
You create a Product object to send to the API. (Looks like product(...) is a helper/factory method that builds a Product.)

3. Act (perform the action)

mockMvc.perform(post("/products")
        .contentType(MediaType.APPLICATION_JSON)
        .content(objectMapper.writeValueAsString(request)))

mockMvc: Spring’s MockMvc simulates HTTP calls to your controllers without starting a real server.
post("/products"): Targets the POST endpoint.
contentType(MediaType.APPLICATION_JSON): Sets Content-Type: application/json.
content(objectMapper.writeValueAsString(request)): Serializes the Product to JSON using Jackson and sends it as the request body.

4. Assert (verify the outcome)
.andExpect(status().isCreated())
Expects HTTP 201 Created, which is the correct status for a successful resource creation.
.andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
Ensures the response is JSON (or compatible, e.g., application/json;charset=UTF-8).
.andExpect(jsonPath("$.id").exists())
Verifies the response body includes an id field (usually generated by the database).

Q.75 shortcuts to go into methods and come out in IntelliJ IDEA?
Ans,
1. Jump into a method (Go to Declaration)
Windows/Linux: Ctrl + B or Ctrl + Click on the method name

2. Go to Implementation
Windows/Linux: Ctrl + Alt + B

3. Navigate Back and Forward
Back:
Windows/Linux: Ctrl + Alt + Left
Forward:
Windows/Linux: Ctrl + Alt + Right

4. Go to Previous/Next Method in the Same File
Previous Method: Alt + Up
Next Method: Alt + Down

Q.76 What is Authentication and Authorization?
Ans. Scenarios:
1. Few links are there which we can access without login. Anyone can access this page.
Ex: scaler.com/academy

2. leetcode.com/problems -> WE can see the problems but to solve the problem we need to login. Account and login must have to solve the problems.
Ex: leetcode.com/problems

3. If anyone want to access the meetings of scaler classes, we need login + extra permissions. We can not access any random recordings, will be accessed which we are part of that and paid the fees.
Ex: scaler.com/meetings/meeting_name

Authentication simply says who you are? We create account using email Id and password or phone number and otp and many more combinations.
What is your name, email, password?
Once you tell mw who your are? you are allowed to visit that page.
Ex:
Anyone can access scaler.com/topics but to watch the content login is required, this is what Authentication.

Authorization is nothing but Authentication + extra role/permissions required to do particular action.

Example which shows what is required to access the links:
1. See the availability of show seats: Neither Authentication nor Authorization required. We can see available seats without login.
2. Book a movie ticket: Only Authentication is required.
3. Cancel a ticket: Both Authentication and Authorization is required. We have to login and need to check who booked the ticket that person can only cancel the ticket.

Q.78 What is RBAC?
Ans. This stands for Role Based Access control.
In Many companies or lot of applications , we need to have particular role to access particular set of resources.

How this role based access control is stored in database.
---------------
User TABLE:]
user_id |  name
1.         User1
2.         User2
3.         User3

We create Role as class, not Enum. If we take RBAC as Enum, then we are doing create role, update role, delete role etc. Every time we have to do code changes, then build the code and deploy the code every time after code changes. But we take this as a class and creating a table in database and changing in database no code changes required. Database data is always visible, just the run the query.
------------------
Roles Table:
role_id  |   name
1.        Student
2.        Instructor
3.        Mentor
4.        Admin

Cardinality between User and Roles:
1 user can have M role and 1 role can as given to multiple Users means M:M cardinality shows. We create Mapping table which is having user_id and role_id columns:
user_role table
user_id  |  role_id
1.           2
2.           4

Q.79 How Authentication flow works?
Ans. 
1. First we have to create account using email + password or phone number + otp etc. Most  commonly used as email + password. We take example of email + password. First client make a sign up call and pass email Id and password - > ../signup(email, password).
2. What server does now? Server process the request and user table will be there in database, server will create the account in user table and store the details(email, password, role etc.) of user in the user table and we get response as account is created successfully with status OK.
3. when we pass email, email verification also happen via sending verification mail to user email Id to avoid no one else can do creating account for other users. When we click on the verification link, is_active column will be there in users table which is default set to false, once we click on verification link, it get updated to true. After clinking on verification link, account will get created and status will be sent as OK successfully account created..
3. after that we can login using email Id and password. -> ../login(email, password)
4. REST API's should be stateless. Every request should be self-sufficient. Any request should not be dependent any of the previous requests.
Means for every request we have to pass email Id and password. As Rest API;s are self sufficent it can not be dependent on other request.
Ex: 
Going to login ->   /loh=gin(email, password)
Going to solve problem with id 101  -> \solve(101, email, passord)
Going to watch recodring -. \watchRecording(17861, email, password)

We show in above API's we have to pass email and password on each API call. This is not a good practice, not a good uder experience but again this is a Rest principle. To overcome this problem, we have concept of token which we implement in authentication.

Q.78 what is BCrypt Password?
Ans, We storing users data in user table. When we store password directly into the database, database can be hacked and data breach issue can happen. so we can not store password as a plain format in the DB.

There are multiple ways to store password in DB.
1. hash password : Using this we store hash passwords in DB. But it cause issue as we know , hash always generates the same value for a string, it gives the same output for the same input.
Ex: Lot of people have same common passwords, if we get the hash of common password which is possible in millions of data, then database can be hacked can accessed users data.
Only hashing which is generating the same string, can leads security issue. We have to go for approach which gives randomness.

2. Hashing + Salting : Salting is just adding randomness to the number like adding machine id, data centre id, timestamp etc. So it will generate the different string for even same passwords. Hacker can not hack the database data. the algorithm which generates different passwords string called as BCrypt password encoder.

Q.79 What is BCrypt Password Encoder?
Ans. Bcrypt Password Encoder always gives us a different value even for the same string.
It ahs 2 methods:
1. encode: encode(raw password) -> encode("abcd") which takes raw password and generate alpha numeric string
2. matches : matches(raw password, encoded password from db) -> matches("abcd", HY45@3167gja6uErtTY56UH!) which takes 2 inputs , one is password which we passing  and one is already present in database and if matches then return true or false.

Example : when we do signUp(email, password)
, BCrypt Password encoder calls encode method and it gives very big alpha numeric string like HY45@3167gja6uErtTY56UH! 
If we call this method on same string, it gives different value every time.
Ex: 
encode(abcd) - different alpha numeric value
encode(abcd) - again different alpha numeric value
encode(abcd) - again different alpha numeric value

Now the previous problem got solved , which was getting using hashing. Same string is not getting stored in database. 
Now the new problem is how to match the password which is passing by user again, if same password we are passing again and matching with existing password, 
Approach 1: we have to encode password again and need to match. But encode method generates value different every time. Password matching can not happen for users.

Approach 2: decode the stored password and match with passed object by user. but if anyone can decode the password again data breach or security issue can happen. That's why BCrypt can not provide decode(), It has only encode method but there is no decode method.

Solution is matches("abcd", HY45@3167gja6uErtTY56UH!) which does mathematics calculation and try to find out , whether it possible to generate the encoded password  from the given raw password or not.

Material: https://auth0.com/docs/get-started/identity-fundamentals/authentication-and-authorization


Q.80 What is Token and this came into picture?
Ans. we see signup or login flow:
1. client makes to call server. user is trying to access scaler.com. We do sign up as /signup(email, password), verification happens and after that user details will get stored in User table in db. and response we get as OK, now we have created account successfully. Sign up means also logged in, but we want to see the difference between sign up and login apis, what happens in backend.

2. client makes call to login/(email, password), now server will call dB and do user details verification as user is existing, if user email is not present then redirecting to sign up page. if user email is present then user will be logged in successfully and response will be sent as OK.

3. Now we again make  a call to server with api /watchRecording(email,password), again server check in db that user details and all and send response with OK or NOT OK. We have to call database to verify user email and password means lot of network calls happen and We noticed for every request we are sending email and password which is not good user experience means system is not user friendly. Now the concept of Token comes.

4. TOKEN: When we try to login, after validation of email and password, server creates token which is a random string which identifies the user. there will be separate Tokens table in database. When logged in successfully, server returns token with status code. Our client is Browser will store the token in the browser cache. Internally Browser store token in HashMap structure like if key is scaler.com , the value is this cached token, if key id amazon.com  , then value is this cached token.

Tokens Table
-----------------------------------------
id | tokenValue | user_id | expiry_date

5. Now we make the call to /watchRecording, client means browser attach the token with request as a request parameter or header, now server received the token and it checks in Tokens table as token is available or not what its expiry date etc., If request is present , you will able to watch recording otherwise request will be rejected as unauthorized. We see Token validations happens on every call which lead to extra latency doe to network call to DB. Solution is cache.

6. Caching can be a good way to reduce the DB calls. but the problem with cache is, 1. cost will increase. and once user log out , 2. we have to update Token table expiry data as expired or invalid and we need to update cache as well. Otherwise Token will be available via cache and user will logged in. To solve this we have to sync cache with database so we can get updates from Token table. Now the solution, instead of calling to DB, if with help of something which do self validating token , our issue with cache is fixed. 

7. Self Validating Token : Solution on cache is If Token is having all the required details for validation like token value, user_id and expiry date etc, server can validate the token without calling the db.
Ex: when we login into scaler.com, we can see auth session token which is a JWT token, it does not look like plain string but easily we can decode it via https://www.jwt.io/. 

8. JWT token: 
Example of JWT token:
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiI0NjE4ODM0MC1iNjVjLTQ0ZmQtOTU2OC1lMjA5ZmIxN2I0NzIiLCJlbWFpbCI6Im1hbXRha3VtYXdhdDQ0QGdtYWlsLmNvbSIsImF1ZCI6ImZhc3RhcGktdXNlcnM6YXV0aCIsImV4cCI6MTc2NDU3OTUwMCwiaWF0IjoxNzYzOTc0NzAwLCJqdGkiOiI3YThlN2M0NmU4OWU1YzM1In0.f-6HFI_af8bO2uimsa2GOxah3pNu6qsVWVxOCvA-FhM
This token has 3 parts.
1. 
eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9 - first component which is available before first dot "." is a header which is attached with header as request parameter.
Decoded Header:
{
  "alg": "HS256",
  "typ": "JWT"
}
2. eyJzdWIiOiI0NjE4ODM0MC1iNjVjLTQ0ZmQtOTU2OC1lMjA5ZmIxN2I0NzIiLCJlbWFpbCI6Im1hbXRha3VtYXdhdDQ0QGdtYWlsLmNvbSIsImF1ZCI6ImZhc3RhcGktdXNlcnM6YXV0aCIsImV4cCI6MTc2NDU3OTUwMCwiaWF0IjoxNzYzOTc0NzAwLCJqdGkiOiI3YThlN2M0NmU4OWU1YzM1In0 - This component is from first dot to last dot, is a user information or we can say, payload or body.
Decoded Payload:
{
  "sub": "46188340-b65c-44fd-9568-e209fb17b472",
  "email": "mamtakumawat44@gmail.com",
  "aud": "fastapi-users:auth",
  "exp": 1764579500,
  "iat": 1763974700,
  "jti": "7a8e7c46e89e5c35"
}

3.
f-6HFI_af8bO2uimsa2GOxah3pNu6qsVWVxOCvA-FhM - This is the part of token which is available after dot. This is used by server to validate the token.
JWT Signature Verification:
Secret
a-string-secret-at-least-256-bits-long 

Q.81 What is JWT?
Ans. JWT stands for JSON Web Token. It has 3 components.
1. Header: which contain the name of the algorithm(HS256,HMAC)  which is used to encrypt the data.
{
  "alg": "HS256",
  "typ": "JWT"
}
which is available in base64 encoding.

2. Payload: It is basically user details and available in base64 Encoding.

3. Signature: It combines Header (A) and payload (B) using "." like this payHS256(A + "." + B) which gives encrypted data and secret key.

Q.82 How validation of JWT happens?
Ans. Server will validate the signature means part C, using the secret key. If modification happened, secret key will not pass and token changed.
That's why most of the companies use the JWT token because it does not require DB call to validate the token. 
Its a self validating Token.
It contains all the information which is required to validate itself.

Q.83 how API key is different from Token?
Ans. Token information is used for authentication and authorization. It checks User is valid or not, it checks user role, user has access or not etc.
API keys are used for third party API's.
Example: Scaler makes call to Razor pay to make payments. How Razor pay will identify that call is from Scaler? What razor pay will do? Razor pay will give set of API's key and gives API key as a secret key. When we go to scaler and Token will be used to authenticate the user. Once Scaler identify the user, now scaler make a call to Razor pay with api key which will attached in request header. If API key is valid, the scaler will be able to make payment to Razor pay.

Q.84 what is OAuth2?
Ans. Example:
1. When we open Scaler website we see there are many ways to login scaler like login using email and password, login via Facebook, login via Google, login via LinkedIn etc. These servers like Google, LinkedIn, fakebook called as Authorization Server. But these servers having their own login functionalities and its tedious task to integrate all those. They are following their own functionalities and nothing common in between them. That's where OAuth framework comes into picture. OAuth is a standardized way of implementing login functionalities.
2. OAuth2 stands for Open Authorization and 2 its version. Although Name contains Authorization but It is used for both Authentication and Authorization.
3. OAuth is a Industry wide followed standard framework for Authorization.

Q.85 How OAuth works?
Ans. There are 4 components of OAuth.
1. Client
2. Authorization Server
3. Resource Server
4. Application

Example to understand components.
Lets say I am a user/client and trying to login CRED app. CRED app allows us to do credit card payments. There is feature on CRED app that when we login via Goole and provide Gmail access, It reads all the emails like minimum due, Last day of bill payment etc. and CRED app fetch all these details and updates these data on CRED app so we can not miss our credit card dues.

I am a suer trying to logon CRED app using Login by Google, CRED already integrated with Google Login functionalities means we can login CRED using Google login form. CRED tells to Google that hey Google this User is trying to login by you/google. please validate or authorize. Google allows Consent form where Gmail access can take or not, If CRED accept then Gmail access will be give and can read all the Gmail mails. Google send token that having user details, expiry details, Read Access of Gmail etc and sent to CRED app. CRED will store this token in application cache. And every month whenever CRED wants to read Gmail mails, It sends request to Gmail Server with Token. Now Gmail will validate the Token by itself or can call to Google Server to validate the Token. If token is valid then Gmail will allow to CRED to read emails of particular user.
and user Credit card details will be displayed on CRED app.
Here 
1. User is Client.
2. Google is Authorization Server
3. Gmail is Resource Server(where Resources are available)
4. CRED is application

Material: https://auth0.com/docs/secure/tokens/json-web-tokens/json-web-token-structure
Material for JWT: https://github.com/jwtk/jjwt

Q.86 Deploying application to cloud Prodviders?
Ans. 
Till now we are running our application using localhost:8080/products/id:
localhost is just a domain name. --its pointing the ip address of my laptop.




















