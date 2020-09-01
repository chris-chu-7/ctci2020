import json

import urllib.request

with urllib.request.urlopen("http://api.bitcoincharts.com/v1/markets.json") as url:
    data = json.loads(url.read().decode())
    for element in data:
        print(element['currency'])
        print("close " + str(element['close']))
        print("high " + str(element['high']))
        print("low " + str(element['low']))
        print("bid " + str(element['bid']))
        print("ask " + str(element['ask']))
        print('\n')