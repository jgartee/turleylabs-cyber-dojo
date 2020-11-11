#! /bin/bash
set -e

ln -s /home/jest/node_modules ${CYBER_DOJO_SANDBOX}/node_modules

npm test
