import sys
import json
import ssl
import urllib.request
import urllib.parse

# Configuracao da URL e contexto SSL para Windows / Python 3.x
BASE = 'http://www.dirlididi.com/api/'
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

def http_get(url):
    req = urllib.request.Request(url, headers={'User-Agent': 'Mozilla/5.0'})
    response = urllib.request.urlopen(req, context=ctx).read().decode('utf-8')
    return json.loads(response)

def http_post(url, data):
    encoded_data = urllib.parse.urlencode(data).encode('utf-8')
    req = urllib.request.Request(url, data=encoded_data, headers={'User-Agent': 'Mozilla/5.0'})
    response = urllib.request.urlopen(req, context=ctx).read().decode('utf-8')
    return json.loads(response)

def get_problem(key):
    return http_get(BASE + 'problem/' + key)

def _submit(key, token, filename, source):
    problem = get_problem(key)
    data = {
        'user': token,
        'problem': key,
        'code': source
    }
    res = http_post(BASE + 'submission/', data)
    print("Results:", res)

def main():
    if len(sys.argv) < 5:
        print("Uso: python dirlididi.py submit <ID_PROBLEMA> <TOKEN> <ARQUIVO>")
        return

    command = sys.argv[1]
    key = sys.argv[2]
    token = sys.argv[3]
    filename = sys.argv[4]

    if command == 'submit':
        with open(filename, 'r', encoding='utf-8') as f:
            source = f.read()
        _submit(key, token, filename, source)

if __name__ == '__main__':
    main()