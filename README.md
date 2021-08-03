## dealer-statistics-leverx
This is my diplom project on LeverX Group Java courses.


The goal of the project is to make RESTful API that helps to give an independent rating to traders of in-game items (CS: GO, Fifa, Dota, Team Fortress, etc.). The rating is based on reviews that are offered by everyone, while reviews are thoroughly checked by admins.


There are three roles: Administrator, Trader and Anonymous.

## Usage scenarios:
A Trader comes to the site, fills out a questionnaire to create his page on the site. After approving account by email trader can create adverts with items he wants to trade. Trader can also leave reviews to other traders.
An Anonymous comes to the site, finds the trader's page, leaves a review. The administrator checks the review, makes an approval or decline.
An Administrator comes to the site, finds new reviews and approvs or declines them.
## Main functionality:
- Creation of traders pages.
- Creating reviews for traders.
- Calculation of the trader's rating.
- Calculation of the overall top traders based on their ratings.
- Filter by games and min-max ratings.
## Registration and authorization
Registration should take place according to the following scenario:

- the user enter the required registration data.
- the system generates a confirmation link (code), adds it to Redis and sends it to the entered email, email codes have a lifetime of 24 hours.
- following the link, / users / {user} / auth / confirm / {code}, the system looks for the code in Redis and if there is, it activates the user and makes it possible to log in
while the user has not confirmed the email, when trying to authorize the user will receive a corresponding error.

## How to use:
- Clone and build project.
- Run project.
