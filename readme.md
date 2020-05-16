# Setting up your Cyber Dojo Server

## Create a VM on your favorite cloud provider
I used Ubuntu 18.04 LTS

## Install docker
https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-18-04

## Install the cyber-dojo shell script
https://blog.cyber-dojo.org/2016/10/running-your-own-cyber-dojo-server-on.html

## Update cyber-dojo
I had an issue with whatever version was latest when I first installed. However, this version worked for me.
`./cyber-dojo update 0.1.137` or `./cyber-dojo update latest`

## Start the server
`./cyber-dojo up`

## Stop the server
`./cyber-dojo down`

## Create start points
Start points let you configure which languages, exercises, and custom exercises are available on your server. Exercises combine files from the exercise directory with additional files and a docker container for the language choice of the user. Custom exercises gives the instructor full control of the exercise files and language docker container.

Read this for more information on setting up start points. https://blog.cyber-dojo.org/2019/05/new-start-point-architecture.html

Examples:
`./cyber-dojo start-point create steves-custom --custom <URL to a Git Repo>`
`./cyber-dojo start-point create steves-languages --languages <URL to a Git Repo>`

## Start the server with custom start points
`./cyber-dojo up --custom=steves-custom --languages=cyberdojo/languages-start-points-all`

`./cyber-dojo up --custom=steves-custom --languages=steves-languages`




